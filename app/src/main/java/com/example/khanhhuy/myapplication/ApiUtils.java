package com.example.khanhhuy.myapplication;

/**
 * Created by yeu_thuong on 10/16/2017.
 */

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
