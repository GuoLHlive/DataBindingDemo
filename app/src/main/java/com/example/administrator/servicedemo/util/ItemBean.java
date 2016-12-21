package com.example.administrator.servicedemo.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.servicedemo.R;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/30.
 */
public class ItemBean {

    /**
     * 拿娶数据（list（bean））中的某一项
     */

//    @BindingAdapter("itemBean")
//    public static void GetItemBean(TextView textView, int postion,BeanDemo.ShowapiResBodyBean beanDemo){
//        if (beanDemo!=null){
//            textView.setText(beanDemo.getContentlist().get(postion).getTitle());
//        }
//    }
//
//    @BindingAdapter("itemImageBean")
//    public static void GetItemImageBean(ImageView imageView, int postion, BeanDemo.ShowapiResBodyBean beanDemo){
//        if (beanDemo!=null){
//            BeanDemo.ShowapiResBodyBean.ContentlistBean contentlistBean = beanDemo.getContentlist().get(postion);
//            String url = contentlistBean.getImg();
//            if (url != null&& url.trim().length()>0){
//                Picasso.with(imageView.getContext()).load(url).error(R.mipmap.ic_launcher).into(imageView);
//            }else {
//                imageView.setImageResource(R.mipmap.ic_launcher);
//            }
//        }
//    }


}
