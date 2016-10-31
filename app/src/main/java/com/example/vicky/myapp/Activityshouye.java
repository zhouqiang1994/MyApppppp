package com.example.vicky.myapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;

public class Activityshouye extends Activity implements ViewFactory {

    private ImageSwitcher switcher;
    private ImageButton sbutton;
    private ImageButton xbutton;

    private static int index = 0;//显示图片资源

    private static final Integer[] imagelist = {
            R.drawable.shouyetongyao,R.drawable.shouyegs,R.drawable.shouyeywg,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityshouye);

        sbutton = (ImageButton) findViewById(R.id.imageButton2);
        xbutton = (ImageButton) findViewById(R.id.imageButton3);
        switcher =(ImageSwitcher) findViewById(R.id.imageSwitcher);
        switcher.setFactory(this);
        switcher.setImageResource(imagelist[index]);

        //设置动画效果
        switcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_in));
        switcher.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_out));

        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                if(index<0){
                    index =imagelist.length-1;
                }
                switcher.setImageResource(imagelist[index]);
            }
        });

        xbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                if(index>=imagelist.length){
                    index=0;
                }
                switcher.setImageResource(imagelist[index]);
            }
        });



    }

    @Override
    public View makeView() {
        return new ImageView(this);
    }


}
