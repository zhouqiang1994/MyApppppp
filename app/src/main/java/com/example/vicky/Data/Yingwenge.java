package com.example.vicky.Data;

import android.content.Context;

import com.example.vicky.FileUtils;
import com.example.vicky.myapp.R;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class Yingwenge {

    ArrayList<String> pathList=new ArrayList<>();
    ArrayList<Integer> wordList=new ArrayList<>();//数组存放文字资源
    public Yingwenge(){


        pathList.add(FileUtils.getYingwengeCache()+"/1.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/2.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/3.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/4.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/5.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/6.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/7.mp3");
        pathList.add(FileUtils.getYingwengeCache()+"/8.mp3");

        wordList.add(R.drawable.a_gs_minnong);
        wordList.add(R.drawable.a_gs_chunxiao);
        wordList.add(R.drawable.a_gs_youziyin);
        wordList.add(R.drawable.a_gs_dengguanquelou);
        wordList.add(R.drawable.a_gs_jingyesi);
        wordList.add(R.drawable.a_gs_huixiangoushu);
        wordList.add(R.drawable.a_gs_qingming);
        wordList.add(R.drawable.a_gs_yonge);
    }

    public ArrayList<String> getPathList() {
        return pathList;
    }

    public ArrayList<Integer> getWordList() {
        return wordList;
    }
}
