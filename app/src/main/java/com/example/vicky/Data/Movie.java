package com.example.vicky.Data;

import com.example.vicky.FileUtils;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/24.
 */

public class Movie {
    ArrayList<String> pathListTongyao =new ArrayList<>();
    public Movie(){
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao1.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao2.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao3.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao4.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao5.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao6.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao7.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao8.mp4");

    }

    public ArrayList<String> getPathListTongyao() {
        return pathListTongyao;
    }

}
