package com.example.administrator.servicedemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
/**
 * Created by Administrator on 2016/11/30.
 */
public class TimeDemo extends BaseObservable{


    private String mTime;

    public TimeDemo(String mTime) {
        this.mTime = mTime;
    }
    @Bindable
    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
        notifyPropertyChanged(BR.mTime);
    }
}
