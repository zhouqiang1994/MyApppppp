package com.example.vicky.myapp;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/**
 * Created by hongyou on 16/11/8.
 */

public class BaseActivity extends Activity {

    /*屏幕的方向
    * ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE,横屏
    * setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);)强制为横屏
    * */
    @Override
    protected void onResume() {
        if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        super.onResume();
    }
}
