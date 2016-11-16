package com.example.vicky.Data;

import android.content.Context;

import com.example.vicky.FileUtils;
import com.example.vicky.myapp.R;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class Tongyao {
    ArrayList<String> tongyaoPathList=new ArrayList<>();
    ArrayList<Integer> wordList=new ArrayList<>();//数组存放文字资源
    public Tongyao(){
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/1.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/2.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/3.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/4.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/5.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/6.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/7.mp3");
        tongyaoPathList.add(FileUtils.getTongyaoCache()+"/8.mp3");

        wordList.add(R.drawable.a_gs_minnong);
        wordList.add(R.drawable.a_gs_chunxiao);
        wordList.add(R.drawable.a_gs_youziyin);
        wordList.add(R.drawable.a_gs_dengguanquelou);
        wordList.add(R.drawable.a_gs_jingyesi);
        wordList.add(R.drawable.a_gs_huixiangoushu);
        wordList.add(R.drawable.a_gs_qingming);
        wordList.add(R.drawable.a_gs_yonge);

    }

    public ArrayList<String> getTongyaoPathList() {
        return tongyaoPathList;
    }

    public ArrayList<Integer> getWordList() {
        return wordList;
    }
}
