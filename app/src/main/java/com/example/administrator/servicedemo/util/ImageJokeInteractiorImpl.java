package com.example.administrator.servicedemo.util;

import android.util.Log;

import com.example.administrator.servicedemo.action.BaseSubscriber;
import com.example.administrator.servicedemo.action.ImageJokeInteractor;
import com.example.administrator.servicedemo.action.JokeApi;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.JokeImageDemo;
import com.example.administrator.servicedemo.fragment.ImageFramgent;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/11/29.
 */
public class ImageJokeInteractiorImpl implements ImageJokeInteractor{

    private JokeApi jokeApi;

    @Inject
    public ImageJokeInteractiorImpl(JokeApi jokeApi) {
        this.jokeApi = jokeApi;
    }


    @Override
    public Subscription queryBeanDemo(String apikey, String page, BaseSubscriber<BeanDemo> subscriber) {
        Observable<BeanDemo> jokeImageDemoObservable = jokeApi.queryJokeImage(apikey, page);
        jokeImageDemoObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
        return subscriber;
    }
}
