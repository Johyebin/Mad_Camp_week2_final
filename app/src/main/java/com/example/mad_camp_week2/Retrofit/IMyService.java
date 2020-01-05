package com.example.mad_camp_week2.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IMyService {
    @POST("register")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("id") String id,
                                    @Field("name") String name);

    @POST("login")
    @FormUrlEncoded
    Observable<String> loginUser(@Field("id") String id);
}
