package com.example.vicky.myapp;

import android.content.Intent;

public class Activityyinwenge extends ShowBaseActivity1 {

    @Override
    protected void setMyView() {
        setContentView(R.layout.activity_activityyinwenge);
    }

    @Override
    protected Intent getMyIntent(int num) {
        Intent intent =new Intent(Activityyinwenge.this,ActivityMusic.class);
        intent.putExtra(ActivityMusic.PATH,num);
        intent.putExtra(ActivityMusic.TYPE,ActivityMusic.YINGWENGE);
        return intent;
    }

}
