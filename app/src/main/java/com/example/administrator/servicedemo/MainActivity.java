package com.example.administrator.servicedemo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.servicedemo.action.AppComponent;
import com.example.administrator.servicedemo.fragment.ImageFramgent;

public class MainActivity extends AppCompatActivity {


    private AppComponent appComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appComponent = MyApp.getApp(getApplicationContext()).component();
        ImageFramgent imageFramgent = appComponent.getImageFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,imageFramgent).commit();

    }




}

