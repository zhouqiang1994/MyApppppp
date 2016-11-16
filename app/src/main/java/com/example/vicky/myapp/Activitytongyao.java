package com.example.vicky.myapp;

import android.content.Intent;


public class Activitytongyao extends ShowBaseActivity {

    @Override
    protected void setMyView() {
        setContentView(R.layout.activity_activitytongyao);
    }

    @Override
    protected Intent getMyIntent(int num) {
        Intent intent =new Intent(Activitytongyao.this,Activitymusic.class);
        intent.putExtra(Activitymusic.PATH,num);
        intent.putExtra(Activitymusic.TYPE, Activitymusic.TONGYAO);
        return intent;
    }
}
