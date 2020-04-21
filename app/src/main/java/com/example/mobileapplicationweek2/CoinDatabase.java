package com.example.mobileapplicationweek2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mobileapplicationweek2.Entites.Coin;

@Database(entities = {Coin.class}, version = 1)
public abstract class CoinDatabase extends RoomDatabase {
    public abstract CoinDao coinDao();
}
