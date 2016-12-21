package com.example.administrator.servicedemo.fragment;


import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.servicedemo.MyApp;
import com.example.administrator.servicedemo.R;
import com.example.administrator.servicedemo.action.AppComponent;
import com.example.administrator.servicedemo.action.BaseSubscriber;
import com.example.administrator.servicedemo.action.ImageJokeInteractor;
import com.example.administrator.servicedemo.adapter.RecyclerViewAdapter;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.example.administrator.servicedemo.bean.JokeImageDemo;
import com.example.administrator.servicedemo.bean.TimeDemo;
import com.example.administrator.servicedemo.config.BaiduApi;
import com.example.administrator.servicedemo.databinding.ImfragmentLayoutBinding;
import com.example.administrator.servicedemo.service.MyService;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/29.
 */
public class  ImageFramgent extends Fragment {

    public static final String TAG = "ImageFramgent:";
    private ImfragmentLayoutBinding binding;
    private AppComponent appComponent;
    private Intent service;
    private BeanDemo beanDemo;
    private RecyclerViewAdapter adapter;
    private ImageJokeInteractor jokeInteractor;
    public boolean isIntent = true;
    public TimeDemo timeDemo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null){
            binding = DataBindingUtil.inflate(inflater, R.layout.imfragment_layout,container,false);
            initView();
        }
        return binding.getRoot();
    }

    private void initView() {
        appComponent = MyApp.getApp(getContext()).component();
        jokeInteractor = appComponent.getImageJokeInteractor();
        jokeInteractor.queryBeanDemo(BaiduApi.APIKEY, "1", new BaseSubscriber<BeanDemo>() {
            @Override
            protected void onSuccess(BeanDemo result) {
                beanDemo = result;
                adapter = new RecyclerViewAdapter(beanDemo);
                binding.recycler.setAdapter(adapter);
                service = new Intent(getContext(),MyService.class);
                getContext().startService(service);

            }
        });




    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        isIntent = false;
        getContext().stopService(service);
    }


    //Handler 防止OOM
//    private static class MyHandler extends Handler{
//        WeakReference<Activity> mWeakReference;
//        private RecyclerViewAdapter adapter;
//
//        public MyHandler(Activity activity,RecyclerViewAdapter adapter) {
//            this.mWeakReference = new WeakReference<>(activity);
//            this.adapter = adapter;
//        }
//
//        @Override
//        public void handleMessage(Message msg) {
//            Activity activity = mWeakReference.get();
//            if (activity!=null){
//                if (msg.what==1){
//                    adapter.notifyDataSetChanged();
//                }
//            }
//
//        }
//    }
}
