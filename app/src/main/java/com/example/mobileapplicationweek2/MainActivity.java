package com.example.mobileapplicationweek2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mobileapplicationweek2.Entites.Coin;
import com.example.mobileapplicationweek2.Entites.CoinLoreResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.MESSAGE";
    private boolean wideMode;
    private RecyclerView mRecyclerView;
    private CoinAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Renders RecyclerView list
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        wideMode = setWideMode(); //Sets boolean value based on whether device has a certain element

        //Sets onClickListener for RecyclerView items
        CoinAdapter.RecyclerViewClickListener listener = new CoinAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (wideMode) {
                    //Wide mode fragment
                    FragmentManager myManager = getSupportFragmentManager();
                    FragmentTransaction myTransaction = myManager.beginTransaction();
                    Fragment myFragment = new DetailFragment();
                    Bundle arguments = new Bundle();
                    arguments.putInt("POSITION", position);
                    myFragment.setArguments(arguments);
                    myTransaction.replace(R.id.detailContainer, myFragment);
                    myTransaction.commit();
                }
                else {
                    //Handheld mode launches a detail activity
                    launchDetailActivity(position);
                }
            }
        };

        //Sets an initial adapter and toast message (not activated)
        mAdapter = new CoinAdapter(new ArrayList<Coin>(), listener);
        Toast toast = Toast.makeText(this, "List Updated!", Toast.LENGTH_LONG*3);

        //Try-catch ensures any connection problems wont cause app to crash
        try {
            //Retrofit is used to get online APIs
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.coinlore.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            CoinService service = retrofit.create(CoinService.class);
            Call<CoinLoreResponse> coinsCall = service.getCoins();

            //Enqueue is used to manage Asynchronous responses
            coinsCall.enqueue(new Callback<CoinLoreResponse>() {
                @Override
                public void onResponse(Call<CoinLoreResponse> call, Response<CoinLoreResponse> response) {
                    if (response.isSuccessful()) {
                        //Updates coin list
                        List<Coin> coins = response.body().getData();
                        mAdapter.setCoins(coins);
                        mRecyclerView.setAdapter(mAdapter);
                        toast.show(); //Activates toast for UI message
                    }
                    else {
                    }
                }
                @Override
                public void onFailure(Call<CoinLoreResponse> call, Throwable t) {
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private boolean setWideMode() {
        if(findViewById(R.id.detailContainer)  ==  null) {
            return false;
        }
        else {
            return true;
        }
    }

    private void launchDetailActivity(int message) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
