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
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/2.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/3.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/4.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/5.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/6.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/7.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/8.mp3");

    }

    public ArrayList<String> getTongyaoPathList() {
        return tongyaoPathList;
    }
}
