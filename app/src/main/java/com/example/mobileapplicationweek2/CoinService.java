package com.example.mobileapplicationweek2;

import com.example.mobileapplicationweek2.Entites.CoinLoreResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinService {
    @GET("api/tickers/")
    Call<CoinLoreResponse> getCoins();

}
