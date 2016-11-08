package com.example.vicky.Data;

import com.example.vicky.FileUtils;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class Gushi {
    ArrayList<String> pathList=new ArrayList<>();
    public Gushi(){


        pathList.add(FileUtils.getYingwengeCache()+"/1.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/2.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/3.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/4.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/5.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/6.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/7.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/8.mp3");
    }

    public ArrayList<String> getPathList() {
        return pathList;
    }
}
