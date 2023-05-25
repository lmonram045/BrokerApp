package com.example.brokerapp.network.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * AlphaVantageService es una interfaz que define los métodos que se van a utilizar para obtener
 * datos de la API de AlphaVantage.
 */
public interface AlphaVantageService {
    /**
     * Obtiene los datos de la serie temporal diaria de una acción. OBTIENE LOS DATOS DE LOS ÚLTIMOS 100 DIAS.
     * @param function es la función de la API que se va a utilizar, en este caso es TIME_SERIES_DAILY
     * @param symbol es el símbolo de la acción que se va a consultar, por ejemplo "IBM"
     * @param apikey es la clave de la API que se va a utilizar.
     * @return un objeto Call<ResponseBody> que contiene la respuesta de la API en formato JSON.
     */
    @GET("query")
    Call<ResponseBody> getTimeSeriesDaily(
            @Query("function") String function,
            @Query("symbol") String symbol,
            @Query("apikey") String apikey
    );

    /**
     * Obtiene los datos de la serie temporal intradiaria de una acción.
     * CON ESTA PODEMOS OBTENER DATOS CADA 1, 5, 15, 30 O 60 MINUTOS.
     * @param function es la función de la API que se va a utilizar, en este caso es TIME_SERIES_INTRADAY
     * @param symbol es el símbolo de la acción que se va a consultar, por ejemplo "IBM"
     * @param interval es el intervalo de tiempo que se va a utilizar, puede ser 1min, 5min, 15min, 30min o 60min
     * @param apikey es la clave de la API que se va a utilizar.
     * @return un objeto Call<ResponseBody> que contiene la respuesta de la API en formato JSON.
     */
    @GET("query")
    Call<ResponseBody> getTimeSeriesIntraday(
            @Query("function") String function,
            @Query("symbol") String symbol,
            @Query("interval") String interval,
            @Query("apikey") String apikey
    );
}
