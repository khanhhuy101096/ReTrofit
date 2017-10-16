package com.example.khanhhuy.myapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by yeu_thuong on 10/16/2017.
 */

public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<Example> saveExample(@Field("title") String mTitle,
                              @Field("body") String mBody,
                              @Field("userId") int mUserId);
}
