package com.example.administrator.servicedemo.action;

import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.JokeImageDemo;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/29.
 */
public interface JokeApi {

    @GET("showapi_open_bus/showapi_joke/joke_pic")
    Observable<BeanDemo> queryJokeImage(@Header("apikey")String apikey, @Query("page")String page);

}
