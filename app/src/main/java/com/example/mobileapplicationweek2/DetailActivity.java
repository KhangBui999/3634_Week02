package com.example.mobileapplicationweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView coinLong;
    private TextView coinShort;
    private TextView value;
    private TextView hourChange;
    private TextView dayChange;
    private TextView weekChange;
    private TextView market;
    private TextView volume;
    private ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Intent intent = getIntent();
        final String symbol = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Coin coin = Coin.searchCoin(symbol);

        coinLong = (TextView) findViewById(R.id.mCoinLong);
        coinShort = (TextView) findViewById(R.id.mCoinShort);
        value = (TextView) findViewById(R.id.mValue);
        hourChange = (TextView) findViewById(R.id.mHourChange);
        dayChange = (TextView) findViewById(R.id.mDayChange);
        weekChange = (TextView) findViewById(R.id.mWeekChange);
        market = (TextView) findViewById(R.id.mMarket);
        volume = (TextView) findViewById(R.id.mVolume);
        search = (ImageView) findViewById(R.id.mSearch);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(symbol);
            }
        });

        showCoin(coin);
    }

    private void showCoin(Coin coin) {
        coinLong.setText(coin.getName());
        coinShort.setText(coin.getSymbol());
        value.setText(String.valueOf(coin.getValue()));
        hourChange.setText(String.valueOf(coin.getChange1h()));
        dayChange.setText(String.valueOf(coin.getChange24h()));
        weekChange.setText(String.valueOf(coin.getChange7d()));
        market.setText(String.valueOf(coin.getMarketcap()));
        volume.setText(String.valueOf(coin.getVolume()));
    }

    private void search(String query) {
        String url = "https://www.google.com/?q="+query;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
