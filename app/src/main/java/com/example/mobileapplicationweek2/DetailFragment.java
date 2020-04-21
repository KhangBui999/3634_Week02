package com.example.mobileapplicationweek2;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mobileapplicationweek2.Entites.Coin;

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
    private ImageView image;

    private CoinDatabase mDb;
    private String coinId;


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        Bundle arguments = getArguments();

        coinId = arguments.getString("COIN_ID");

        coinLong = v.findViewById(R.id.mCoinLong);
        coinShort = v.findViewById(R.id.mCoinShort);
        value = v.findViewById(R.id.mValue);
        hourChange = v.findViewById(R.id.mHourChange);
        dayChange = v.findViewById(R.id.mDayChange);
        weekChange = v.findViewById(R.id.mWeekChange);
        market = v.findViewById(R.id.mMarket);
        volume = v.findViewById(R.id.mVolume);
        search = v.findViewById(R.id.mSearch);
        image = v.findViewById(R.id.imageView2);

        mDb = Room.databaseBuilder(getActivity().getApplicationContext(), CoinDatabase.class,
                "coins-database").build();

        new LoadCoinUI().execute();

        return v;
    }

    public class LoadCoinUI extends AsyncTask<Void, Void, Coin> {
        @Override
        protected Coin doInBackground(Void... voids) {
            return mDb.coinDao().getCoin(coinId);
        }

        @Override
        protected void onPostExecute(Coin coin) {
            try {
                String url = "https://c1.coinlore.com/img/25x25/"+coin.getNameid()+".png";
                Glide.with(getActivity())
                        .load(url)
                        .into(image);
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
        String url = "https://www.google.com/search?q="+query;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
