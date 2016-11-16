package com.example.vicky.myapp;

import android.content.Intent;

public class Activityyinwenge extends ShowBaseActivity1 {

    @Override
    protected void setMyView() {
        setContentView(R.layout.activity_activityyinwenge);
    }

    @Override
    protected Intent getMyIntent(int num) {
        Intent intent =new Intent(Activityyinwenge.this,Activitymusic.class);
        intent.putExtra(Activitymusic.PATH,num);
        intent.putExtra(Activitymusic.TYPE, Activitymusic.YINGWENGE);
        return intent;
    }

}
