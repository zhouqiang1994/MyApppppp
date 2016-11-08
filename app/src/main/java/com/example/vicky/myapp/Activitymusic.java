package com.example.vicky.myapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.vicky.Data.Gushi;
import com.example.vicky.Data.Tongyao;
import com.example.vicky.Data.Yingwenge;
import com.example.vicky.FileUtils;

import java.io.File;
import java.util.ArrayList;

public class ActivityMusic extends BaseActivity {
    public MediaPlayer player; // 定义多媒体对象
    public static  final String PATH="path";
    public static  final String TYPE="type";
    public static  final int YINGWENGE=1;
    public static  final int GUSHI=2;
    public static  final int TONGYAO=3;

    private int type;
    private int num;
    private ArrayList<String> pathList=new ArrayList<>();

    private int nowNum;

    private ImageButton next;
    private ImageButton last;
    private ImageButton stop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymusic);
        initButton();
        player = new MediaPlayer();

        initPath();

        start(pathList.get(num));//得到当前播放音乐的路径);

    }

    private void initButton() {
        next = (ImageButton)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
                stop.setImageDrawable(getDrawable(R.drawable.yinyuezt));
            }
        });
        stop = (ImageButton)findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.isPlaying()){
                    player.pause();
                    stop.setImageDrawable(getDrawable(R.drawable.yinyuebf));
                }else{
                    player.start();
                    stop.setImageDrawable(getDrawable(R.drawable.yinyuezt));
                }
            }
        });

        last = (ImageButton)findViewById(R.id.last);
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                last();
                stop.setImageDrawable(getDrawable(R.drawable.yinyuezt));
            }
        });
    }

    private void initPath() {
        type = getIntent().getIntExtra(TYPE,0);
        num = getIntent().getIntExtra(PATH,0);
        nowNum=num;
        if(type==YINGWENGE){
            pathList= new Yingwenge().getPathList();
        }else if(type==TONGYAO){
            pathList= new Tongyao().getTongyaoPathList();
        }else if(type==GUSHI){
            pathList= new Gushi().getPathList();
        }
    }

    public void next() {
        if(nowNum==7){
            Toast.makeText(this,"这是最后一首",Toast.LENGTH_LONG).show();
            return;
        }
        nowNum++;
        start(pathList.get(nowNum));
    }
    public void last() {
        if(nowNum==0){
            Toast.makeText(this,"这是第一首",Toast.LENGTH_LONG).show();
            return;
        }
        nowNum--;
        start(pathList.get(nowNum));
    }

    public void start(String path) {
        try {
            player.reset(); //重置多媒体

            player.setDataSource(path);//为多媒体对象设置播放路径
            player.prepare();//准备播放
            player.start();//开始播放
        } catch (Exception e) {
            Log.v("MusicService", e.getMessage());
        }
    }

    public void pause() {
        if (player.isPlaying())
            player.pause();
        else
            player.start();
    }

    public void stop() {
        if (player.isPlaying()) {
            player.stop();
        }
    }

    @Override
    public void finish() {
        super.finish();
        player.stop();
    }
}
