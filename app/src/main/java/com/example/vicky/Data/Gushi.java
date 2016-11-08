package com.example.vicky.Data;

import com.example.vicky.FileUtils;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class Gushi {
    ArrayList<String> pathList=new ArrayList<>();
    public Gushi(){


        pathList.add(FileUtils.getGushiCache()+"/1.mp3");
        pathList.add(FileUtils.getGushiCache()+"/2.mp3");
        pathList.add(FileUtils.getGushiCache()+"/3.mp3");
        pathList.add(FileUtils.getGushiCache()+"/4.mp3");
        pathList.add(FileUtils.getGushiCache()+"/5.mp3");
        pathList.add(FileUtils.getGushiCache()+"/6.mp3");
        pathList.add(FileUtils.getGushiCache()+"/7.mp3");
        pathList.add(FileUtils.getGushiCache()+"/8.mp3");
    }

    public ArrayList<String> getPathList() {
        return pathList;
    }
}
