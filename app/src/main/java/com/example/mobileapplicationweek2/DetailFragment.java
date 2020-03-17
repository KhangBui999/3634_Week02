package com.example.mobileapplicationweek2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        Bundle arguments = getArguments();
        int position = arguments.getInt("POSITION");
        Coin coin = Coin.getCoins().get(position);

        coinLong = v.findViewById(R.id.mCoinLong);
        coinShort = v.findViewById(R.id.mCoinShort);
        value = v.findViewById(R.id.mValue);
        hourChange = v.findViewById(R.id.mHourChange);
        dayChange = v.findViewById(R.id.mDayChange);
        weekChange = v.findViewById(R.id.mWeekChange);
        market = v.findViewById(R.id.mMarket);
        volume = v.findViewById(R.id.mVolume);
        search = v.findViewById(R.id.mSearch);

        coinLong.setText(coin.getName());
        coinShort.setText(coin.getSymbol());
        value.setText("$" + coin.getValue());
        hourChange.setText(coin.getChange1h() + " %");
        dayChange.setText(coin.getChange24h() + " %");
        weekChange.setText(coin.getChange7d() + " %");
        market.setText("$" + String.format("%,.2f", coin.getMarketcap()));
        volume.setText("$" + String.format("%,.2f", coin.getVolume()));

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search();
            }
        });

        return v;
    }


    private void search() {
        String url = "https://www.google.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
