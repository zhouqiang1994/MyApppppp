package com.example.vicky.myapp;

import android.app.Activity;
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


public class Activitytongyao extends BaseActivity {

    ImageButton btnRight;
    ImageButton btnLeft;
    ImageButton btnBack;

    private View  view2, view3;
    private ViewPager viewPager;  //对应的viewPager

    private List<View> viewList;//view数组

    PagerAdapter pagerAdapter;

    TableView tableView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytongyao);
        initData();
        initView();


        viewPager.setAdapter(pagerAdapter);
    }

    private void initData() {
        LayoutInflater inflater=getLayoutInflater();
        tableView1 = new TableView(this);
        tableView1.setDrawList(this,null);
        view2 = inflater.inflate(R.layout.layout2,null);
        view3 = inflater.inflate(R.layout.layout3, null);

        viewList = new ArrayList<View>();// 将要分页显示的View装入数组中
        viewList.add(tableView1);
        viewList.add(view2);
        viewList.add(view3);

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


}
