package com.example.mobileapplicationweek2;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobileapplicationweek2.Entites.Coin;
import com.example.mobileapplicationweek2.Entites.CoinLoreResponse;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailFragment extends Fragment {

    private TextView coinLong;
    private TextView coinShort;
    private TextView value;
    private TextView hourChange;
    private TextView dayChange;
    private TextView weekChange;
    private TextView market;
    private TextView volume;
    private ImageView search;

    private int position;


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        Bundle arguments = getArguments();
        position = arguments.getInt("POSITION");

        coinLong = v.findViewById(R.id.mCoinLong);
        coinShort = v.findViewById(R.id.mCoinShort);
        value = v.findViewById(R.id.mValue);
        hourChange = v.findViewById(R.id.mHourChange);
        dayChange = v.findViewById(R.id.mDayChange);
        weekChange = v.findViewById(R.id.mWeekChange);
        market = v.findViewById(R.id.mMarket);
        volume = v.findViewById(R.id.mVolume);
        search = v.findViewById(R.id.mSearch);

        new LoadCoinUI().execute();

        return v;
    }

    public class LoadCoinUI extends AsyncTask<Void, Void, List<Coin>> {
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
                return coinsResponse.body().getData();
            }
            catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Coin> coins) {
            //Updates coin list
            try {
                Coin coin = coins.get(position);
                coinLong.setText(coin.getName());
                coinShort.setText(coin.getSymbol());
                value.setText("$" + coin.getPriceUsd());
                hourChange.setText(coin.getPercentChange1h() + " %");
                dayChange.setText(coin.getPercentChange24h() + " %");
                weekChange.setText(coin.getPercentChange7d() + " %");
                market.setText("$" + String.format("%,.2f", Double.parseDouble(coin.getMarketCapUsd())));
                volume.setText("$" + String.format("%,.2f", coin.getVolume24()));
                search.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        search(coin.getName());
                    }
                });
            }
            catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    private void search(String query) {
        String url = "https://www.google.com/?q="+query;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
