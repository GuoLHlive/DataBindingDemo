package com.example.administrator.servicedemo.action;

import com.example.administrator.servicedemo.MyApp;
import com.example.administrator.servicedemo.adapter.RecyclerViewAdapter;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.example.administrator.servicedemo.fragment.ImageFramgent;
import com.example.administrator.servicedemo.module.JokeModule;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016/11/29.
 */


@Singleton
@Component( modules = JokeModule.class)
public interface AppComponent {
    void inject(MyApp myApp);
    ImageJokeInteractor getImageJokeInteractor();
    ImageFramgent getImageFragment();
    BeanDemo getBeanDemo();
}
