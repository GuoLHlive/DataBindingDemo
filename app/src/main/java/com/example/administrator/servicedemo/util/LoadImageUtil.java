package com.example.administrator.servicedemo.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.example.administrator.servicedemo.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2016/11/29.
 */
public class LoadImageUtil {
    /*
        下载图片Picasso
     */

    @BindingAdapter("LoadImageUrl")
    public static void LoadImage(ImageView imageView,String url){
        if (url != null&& url.trim().length()>0){
            Picasso.with(imageView.getContext()).load(url).error(R.mipmap.ic_launcher).into(imageView);
        }else {
            imageView.setImageResource(R.mipmap.ic_launcher);
        }
    }



}
