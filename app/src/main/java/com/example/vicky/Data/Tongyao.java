package com.example.vicky.Data;

import android.content.Context;

import com.example.vicky.FileUtils;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class Tongyao {
    ArrayList<String> tongyaoPathList=new ArrayList<>();
    public Tongyao(){
       tongyaoPathList.add(FileUtils.getTongyaoCache()+"/1.mp3");
    }

    public ArrayList<String> getTongyaoPathList() {
        return tongyaoPathList;
    }
}
