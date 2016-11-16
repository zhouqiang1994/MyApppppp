package com.example.vicky.Data;

import com.example.vicky.FileUtils;
import com.example.vicky.myapp.R;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/8.
 */

public class Gushi {
    ArrayList<String> pathList=new ArrayList<>();//数组存放资源

    ArrayList<Integer> wordList=new ArrayList<>();//数组存放文字资源
    public Gushi(){
        pathList.add(FileUtils.getGushiCache()+"/1.mp3");
        pathList.add(FileUtils.getGushiCache()+"/2.mp3");
        pathList.add(FileUtils.getGushiCache()+"/3.mp3");
        pathList.add(FileUtils.getGushiCache()+"/4.mp3");
        pathList.add(FileUtils.getGushiCache()+"/5.mp3");
        pathList.add(FileUtils.getGushiCache()+"/6.mp3");
        pathList.add(FileUtils.getGushiCache()+"/7.mp3");
        pathList.add(FileUtils.getGushiCache()+"/8.mp3");

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
