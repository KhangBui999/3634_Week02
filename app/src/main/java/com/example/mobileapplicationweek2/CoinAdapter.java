package com.example.mobileapplicationweek2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.mobileapplicationweek2.Entites.Coin;

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.CoinViewHolder> {
    private List<Coin> mCoins;
    private RecyclerViewClickListener mListener;


    //CoinAdapter Constructor
    public CoinAdapter(List<Coin> coins, RecyclerViewClickListener listener) {
        mCoins = coins;
        mListener = listener;
    }


    //Creates an interface template
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }


    //Creates a CoinViewHolder class that can be invoked without CoinAdapter class
    public static class CoinViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name, value, change;
        private RecyclerViewClickListener mListener;

        //Constructor for CoinViewHolder
        public CoinViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            name = v.findViewById(R.id.tvName);
            value = v.findViewById(R.id.tvValue);
            change = v.findViewById(R.id.tvChange);
        }

        //onClick method from RecyclerViewClickListener interface
        @Override
        public void onClick(View view) { mListener.onClick(view, getAdapterPosition()); }
    }

    //Creates CoinViewHolder (layout object) and sets it
    @Override
    public CoinAdapter.CoinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_list_row, parent, false);
        return new CoinViewHolder(v, mListener);
    }


    //Sets text for TextView elements
    @Override
    public void onBindViewHolder(CoinViewHolder holder, int position) {
        Coin coin = mCoins.get(position);
        holder.name.setText(coin.getName());
        holder.value.setText("$" + coin.getPriceUsd());
        holder.change.setText(coin.getPercentChange1h() + "%");
    }


    //Needed for RecyclerView
    @Override
    public int getItemCount() {
        return mCoins.size();
    }

    public void setCoins(List<Coin> coins) {
        mCoins.clear();
        mCoins.addAll(coins);
        notifyDataSetChanged();
    }
}
