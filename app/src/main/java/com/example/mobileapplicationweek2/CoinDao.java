package com.example.mobileapplicationweek2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mobileapplicationweek2.Entites.Coin;

import java.util.List;

@Dao
public interface CoinDao {
    //Delete all records currently in the DB
    @Delete
    void deleteAll(Coin... coins);

    //Insert all received records into the DB
    @Insert
    void insertAll(Coin... coins);

    //Query and return all results in the DB
    @Query("SELECT * FROM coin")
    List<Coin> getCoins();

    //Query and return ONE coin's results based on the received ID
    @Query("SELECT * FROM coin WHERE id = :coinId")
    Coin getCoin(String coinId);
}
