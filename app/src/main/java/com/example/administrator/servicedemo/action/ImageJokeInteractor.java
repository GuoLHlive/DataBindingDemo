package com.example.administrator.servicedemo.action;

import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.example.administrator.servicedemo.bean.JokeImageDemo;

import rx.Subscription;

/**
 * Created by Administrator on 2016/11/29.
 */
public interface ImageJokeInteractor {

    //订阅动作
    Subscription queryBeanDemo(String apikey, String page, BaseSubscriber<BeanDemo> subscriber);

}
