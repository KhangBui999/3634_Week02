package com.example.mobileapplicationweek2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mobileapplicationweek2.Entites.Coin;
import com.example.mobileapplicationweek2.Entites.CoinLoreResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.MESSAGE";
    private RecyclerView mRecyclerView;
    private CoinAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private CoinDatabase mDb;
    private List<Coin> coins;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Renders RecyclerView list
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Sets onClickListener for RecyclerView items
        CoinAdapter.RecyclerViewClickListener listener = new CoinAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                String coinId = coins.get(position).getId();
                if (findViewById(R.id.detailContainer)  !=  null) {
                    //Wide mode fragment
                    FragmentManager myManager = getSupportFragmentManager();
                    FragmentTransaction myTransaction = myManager.beginTransaction();
                    Fragment myFragment = new DetailFragment();
                    Bundle arguments = new Bundle();
                    arguments.putString("COIN_ID", coinId);
                    myFragment.setArguments(arguments);
                    myTransaction.replace(R.id.detailContainer, myFragment);
                    myTransaction.commit();
                }
                else {
                    //Handheld mode launches a detail activity
                    launchDetailActivity(coinId);
                }
            }
        };

        //Final rendering of the RecyclerView list
        mAdapter = new CoinAdapter(new ArrayList<Coin>(), listener);
        mRecyclerView.setAdapter(mAdapter);

        //Sets CoinDatabase object
        mDb = Room.databaseBuilder(getApplicationContext(), CoinDatabase.class, "coins-database")
                .build();

        //Set default toast message
        toast = Toast.makeText(this, "List Updated!", Toast.LENGTH_SHORT);

        //Executes AsyncTasks
        new CallCoinAPI().execute();
        new CallCoinDatabase().execute();
    }

    public class CallCoinAPI extends AsyncTask<Void, Void, List<Coin>> {
        @Override
        protected List<Coin> doInBackground(Void... voids) {
            try{
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.coinlore.net/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                CoinService service = retrofit.create(CoinService.class);
                Call<CoinLoreResponse> coinsCall = service.getCoins();
                Response<CoinLoreResponse> coinsResponse = coinsCall.execute();
                coins = coinsResponse.body().getData();
                mDb.coinDao().deleteAll(mDb.coinDao().getCoins().toArray(new Coin[mDb.coinDao().getCoins().size()]));
                mDb.coinDao().insertAll(coins.toArray(new Coin[coins.size()]));
                return coins;
            }
            catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Coin> coins) {
            mAdapter.setCoins(coins);
        }
    }

    public class CallCoinDatabase extends AsyncTask<Void, Void, List<Coin>> {
        @Override
        protected List<Coin> doInBackground(Void... voids) {
            return mDb.coinDao().getCoins();
        }

        @Override
        protected void onPostExecute(List<Coin> coins) {
            mAdapter.setCoins(coins);
            toast.show(); //activates toast for UI message
        }
    }

    private void launchDetailActivity(String message) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("COIN_ID", message);
        startActivity(intent);
    }
}
