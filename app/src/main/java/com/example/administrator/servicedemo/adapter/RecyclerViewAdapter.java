package com.example.administrator.servicedemo.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.servicedemo.R;
import com.example.administrator.servicedemo.bean.BeanDemo;
import com.example.administrator.servicedemo.bean.ContentlistBean;
import com.example.administrator.servicedemo.databinding.ItemviewLayoutBinding;


import java.util.ArrayList;


/**
 * Created by Administrator on 2016/11/29.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

   private BeanDemo beanDemo;

    public RecyclerViewAdapter(BeanDemo beanDemo) {
        this.beanDemo = beanDemo;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindPostion(position);
        holder.bindBeanDemo();
    }

    @Override
    public int getItemCount() {
        return this.beanDemo.getShowapi_res_body().getContentlist().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemviewLayoutBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        public void bindPostion(int postion){
            binding.setPostion(postion);
        }

        public void bindBeanDemo(){
            binding.setBeanDemo(beanDemo);
        }



    }
}
