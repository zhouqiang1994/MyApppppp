package com.example.vicky.myapp;

import android.content.Intent;


public class ActivityGushi extends ShowBaseActivity3 {

    @Override
    protected void setMyView() {
        setContentView(R.layout.activity_gushi);
    }

    @Override
    protected Intent getMyIntent(int num) {
        Intent intent =new Intent(ActivityGushi.this,Activitymusic.class);
        intent.putExtra(Activitymusic.PATH,num);
        intent.putExtra(Activitymusic.TYPE, Activitymusic.GUSHI);
        return intent;
    }
}
