package com.example.administrator.servicedemo;

import android.app.Application;
import android.content.Context;


import com.example.administrator.servicedemo.action.AppComponent;
import com.example.administrator.servicedemo.action.DaggerAppComponent;
import com.example.administrator.servicedemo.module.JokeModule;

/**
 * Created by Administrator on 2016/11/29.
 */
public class MyApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setDraggerConfig();
    }


    public AppComponent component(){
        return appComponent;
    }

    public static MyApp getApp(Context context){
        return ((MyApp) context.getApplicationContext());
    }

    private void setDraggerConfig() {
       appComponent = DaggerAppComponent.builder().jokeModule(new JokeModule()).build();
        appComponent.inject(this);
    }
}
