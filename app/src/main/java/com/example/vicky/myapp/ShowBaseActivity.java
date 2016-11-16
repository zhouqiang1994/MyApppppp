package com.example.vicky.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.vicky.view.TableView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongyou on 16/11/8.
 */

public abstract class ShowBaseActivity extends BaseActivity {

    ImageButton btnRight;
    ImageButton btnLeft;
    ImageButton btnBack;

    protected ViewPager viewPager;  //对应的viewPager

    protected List<View> viewList;//view数组

    PagerAdapter pagerAdapter;

    TableView tableView1;
    TableView tableView2;

    @Override
    /*当一个Activity在PAUSE时，被kill之前，它可以调用onSaveInstanceState()来保存当前activity的状态信息
    * 用来保存状态信息的Bundle会同时传给两个method,即onRestoreInstanceState() and onCreate().
    * */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMyView();
        initData();
        initView();
        viewPager.setAdapter(pagerAdapter);
    }

    private void initData() {
        LayoutInflater inflater=getLayoutInflater();//LayoutInflater是用来找res/layout/下的xml布局文件，并且实例化
        initTableView();

        viewList = new ArrayList<View>();// 将要分页显示的View装入数组中
        viewList.add(tableView1);//两个分页
        viewList.add(tableView2);

        pagerAdapter = new PagerAdapter() {
            //返回的是页卡的数量
            @Override
            public int getCount() {
                return viewList.size();
            }

            //view是否来自于对象
            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                return arg0 == arg1;
            }

            //销毁一个页卡
            @Override
            public void destroyItem(ViewGroup container, int position,
                                    Object object) {
                container.removeView(viewList.get(position));
            }

            //实例化一个页卡
            @Override
            public Object instantiateItem(ViewGroup container, int position) {

                container.addView(viewList.get(position));


                return viewList.get(position);
            }
        };

    }

    private void initTableView() {
        tableView1 = new TableView(this);
        tableView1.setDrawList(this,null);
        tableView1.setOnItemClick(new TableView.OnItemClickListener() {
            @Override
            public void onItemClick(int num) {
                startActivity(getMyIntent(num));

            }
        });
        tableView2 = new TableView(this);
        tableView2.setDrawList(this,null);
        tableView2.setOnItemClick(new TableView.OnItemClickListener() {
            @Override
            public void onItemClick(int num) {
                startActivity(getMyIntent(num+4));
            }
        });
    }

    private void initView() {
        //返回按钮
        btnBack=(ImageButton)findViewById(R.id.back_button);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //左边按钮
        btnLeft=(ImageButton)findViewById(R.id.ib_left);
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewPager.getCurrentItem()==0) {
                    viewPager.setCurrentItem(viewList.size(),true);
                }else{
                    viewPager.setCurrentItem(viewPager.getCurrentItem()-1,true);
                }
            }
        });

        //右边按钮
        btnRight=(ImageButton)findViewById(R.id.ib_right);
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewPager.getCurrentItem()+1>=viewList.size()) {
                    viewPager.setCurrentItem(0,true);
                }else{
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1,true);
                }
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewpager);

    }


    protected abstract void setMyView();
    protected abstract Intent getMyIntent(int num);
}
