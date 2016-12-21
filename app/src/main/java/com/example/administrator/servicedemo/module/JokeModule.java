package com.example.administrator.servicedemo.module;

import com.example.administrator.servicedemo.action.ImageJokeInteractor;
import com.example.administrator.servicedemo.action.JokeApi;
import com.example.administrator.servicedemo.adapter.RecyclerViewAdapter;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.example.administrator.servicedemo.fragment.ImageFramgent;
import com.example.administrator.servicedemo.util.ImageJokeInteractiorImpl;
import com.example.administrator.servicedemo.util.RetrofitUtil;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2016/11/29.
 */

@Module
public class JokeModule {

    @Provides
    public Retrofit provodeRetrofit(){
        return RetrofitUtil.getnstance();
    }

    @Provides
    public JokeApi provideJokeApi(Retrofit retrofit){
        return retrofit.create(JokeApi.class);
    }

    @Provides
    public ImageJokeInteractor provideImageInteractor(JokeApi jokeApi){
        return new ImageJokeInteractiorImpl(jokeApi);
    }

    @Singleton
    @Provides
    public ImageFramgent provideImageFragment(){
        return new ImageFramgent();
    }

    @Singleton
    @Provides
    public BeanDemo provideBeanDemo(){
        return new BeanDemo();
    }

}
