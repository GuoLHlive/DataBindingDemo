package com.example.administrator.servicedemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.administrator.servicedemo.MainActivity;
import com.example.administrator.servicedemo.MyApp;
import com.example.administrator.servicedemo.action.AppComponent;
import com.example.administrator.servicedemo.action.BaseSubscriber;
import com.example.administrator.servicedemo.action.ImageJokeInteractor;
import com.example.administrator.servicedemo.adapter.RecyclerViewAdapter;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.example.administrator.servicedemo.bean.JokeImageDemo;
import com.example.administrator.servicedemo.config.BaiduApi;
import com.example.administrator.servicedemo.fragment.ImageFramgent;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/11/30.
 */
public class MyService extends Service{



    private AppComponent appComponent;
    private ImageJokeInteractor imageJokeInteractor;
    private RecyclerViewAdapter adapter;
    private TimerTask task;
    private Timer timer;
    private ImageFramgent imageFramgent;
    private BeanDemo beanDemo;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(ImageFramgent.TAG,"MyService:onCreate");
        appComponent = MyApp.getApp(getApplicationContext()).component();
        imageJokeInteractor = appComponent.getImageJokeInteractor();
        beanDemo = appComponent.getBeanDemo();
        task = new TimerTask() {
            @Override
            public void run() {
                QueryJson();
            }
        };
        timer = new Timer();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(ImageFramgent.TAG,"MyService:onBind");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        timer.schedule(task,1000,1000);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(ImageFramgent.TAG,"MyService:onDestroy");
    }


//    public void QueryJson(){
//        imageJokeInteractor.queryJoke(BaiduApi.APIKEY, "1", new BaseSubscriber<JokeImageDemo>() {
//            @Override
//            protected void onSuccess(JokeImageDemo result) {
//                List<ContentlistBean> contentlist = result.getShowapi_res_body().getContentlist();
//                if (list.size()!=0){
//                    list.clear();
//                }
//                list.addAll(contentlist);
//                Message message = new Message();
//                message.what = 1;
//                imageFramgent.handler.sendMessage(message);
//                Log.i(ImageFramgent.TAG,"更新一次");
//            }
//        });
//    }

    public void QueryJson(){
        imageJokeInteractor.queryBeanDemo(BaiduApi.APIKEY, "1", new BaseSubscriber<BeanDemo>() {
            @Override
            protected void onSuccess(BeanDemo result) {
                    Log.i(ImageFramgent.TAG,"更新一次");
                    beanDemo.setShowapi_res_body(result.getShowapi_res_body());
                    
            }
        });
    }

}
