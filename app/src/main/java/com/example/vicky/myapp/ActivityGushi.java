package com.example.vicky.myapp;

import android.content.Intent;


public class ActivityGushi extends ShowBaseActivity3 {

    @Override
    protected void setMyView() {
        setContentView(R.layout.activity_gushi);
    }

    @Override
    protected Intent getMyIntent(int num) {
        Intent intent =new Intent(ActivityGushi.this,ActivityMusic.class);
        intent.putExtra(ActivityMusic.PATH,num);
        intent.putExtra(ActivityMusic.TYPE,ActivityMusic.GUSHI);
        return intent;
    }
}
