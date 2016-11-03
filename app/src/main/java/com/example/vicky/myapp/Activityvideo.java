package com.example.vicky.myapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class Activityvideo extends Activity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityvideo);

        video =(VideoView)findViewById(R.id.videoView);

        //拼出在资源文件夹下的视频文件路径string字符串
       // String url="android.resource://"+getPackageName()+"/"+R.raw.cdx_czsm;

        //字符串解析成uri
        //Uri uri =Uri.parse(url);

        //给videoview设置播放资源
       // video.setVideoURI(uri);

        //用相对布局包裹videoview实现视频全屏播放
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        video.setLayoutParams(layoutParams);

        video.start();
    }

}
