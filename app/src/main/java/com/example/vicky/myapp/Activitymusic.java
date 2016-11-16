package com.example.vicky.myapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.vicky.Data.Gushi;
import com.example.vicky.Data.Tongyao;
import com.example.vicky.Data.Yingwenge;
import com.example.vicky.FileUtils;

import java.util.ArrayList;

public class Activitymusic extends BaseActivity {
    public MediaPlayer player; // 定义多媒体对象
    public static  final String PATH="path";
    public static  final String TYPE="type";
    public static  final int YINGWENGE=1;
    public static  final int GUSHI=2;
    public static  final int TONGYAO=3;

    private int type;
    private int num;
    private ArrayList<String> pathList=new ArrayList<>();
    private ArrayList<Integer> wordList=new ArrayList<>();
    private int nowNum;

    private ImageButton next;
    private ImageButton last;
    private ImageButton stop;
    private ImageButton back;
    private ImageButton video;
    private ImageView word;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymusic);
        word =(ImageView)findViewById(R.id.ivWord);
        initButton();
        player = new MediaPlayer();

        initPath();
        word.setImageResource(wordList.get(num));
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

        video = (ImageButton)findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activitymusic.this,ActivityVideo.class);
                intent.putExtra(ActivityVideo.PATH,FileUtils.getExtDirCache()+"/movie.mp4");
                startActivity(intent);
                finish();

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

        last = (ImageButton)findViewById(R.id.fanhui);
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initPath() {
        type = getIntent().getIntExtra(TYPE,0);
        num = getIntent().getIntExtra(PATH,0);
        nowNum=num;
        if(type==YINGWENGE){
            pathList= new Yingwenge().getPathList();
            wordList = new Yingwenge().getWordList();
        }else if(type==TONGYAO){
            pathList= new Tongyao().getTongyaoPathList();
            wordList = new Tongyao().getWordList();
        }else if(type==GUSHI){
            pathList= new Gushi().getPathList();
            wordList = new Gushi().getWordList();
        }
    }

    public void next() {
        if(nowNum==7){
            Toast.makeText(this,"这是最后一首",Toast.LENGTH_LONG).show();
            return;
        }
        nowNum++;
//        Toast.makeText(this,pathList.get(nowNum),Toast.LENGTH_LONG).show();
        word.setImageResource(wordList.get(nowNum));
        start(pathList.get(nowNum));
    }
    public void last() {
        if(nowNum==0){
            Toast.makeText(this,"这是第一首",Toast.LENGTH_LONG).show();
            return;
        }
        nowNum--;
//        Toast.makeText(this,pathList.get(nowNum),Toast.LENGTH_LONG).show();
        word.setImageResource(wordList.get(nowNum));
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


    @Override
    public void finish() {
        super.finish();
        player.stop();
    }
}
