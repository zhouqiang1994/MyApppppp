package com.example.vicky.myapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.example.vicky.FileUtils;

import java.io.File;

public class ActivityVideo extends BaseActivity {

    VideoView video;
    private ImageButton btnStop;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityvideo);
        initView();
        video =(VideoView)findViewById(R.id.videoView);
        String videoPath  = FileUtils.getExtDirCache()+"/movie.mov";
        video.setVideoPath(videoPath);
        video.start();
    }

    private void initView() {
        btnBack=(ImageButton)findViewById(R.id.back_button);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnStop=(ImageButton)findViewById(R.id.pause);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(video.isPlaying()){
                    video.pause();
                    btnStop.setImageDrawable(getDrawable(R.drawable.yinyuebf));
                }else{
                    video.start();
                    btnStop.setImageDrawable(getDrawable(R.drawable.yinyuezt));
                }
            }
        });

    }

}
