package com.example.brokerapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * RetrofitClientInstance es una clase singleton que crea una instancia de retrofit y la devuelve
 * a quien la solicite.
 */
public class RetrofitClientInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://www.alphavantage.co/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
