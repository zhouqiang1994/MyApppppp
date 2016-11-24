package com.example.vicky.Data;

import com.example.vicky.FileUtils;

import java.util.ArrayList;

/**
 * Created by hongyou on 16/11/24.
 */

public class Movie {
    ArrayList<String> pathListTongyao =new ArrayList<>();
    ArrayList<String> pathListGushi =new ArrayList<>();
    public Movie(){
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao1.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao2.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao3.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao4.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao5.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao6.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao7.mp4");
        pathListTongyao.add(FileUtils.getMovieCache()+"/tongyao8.mp4");

        pathListGushi.add(FileUtils.getMovieCache()+"/gushi1.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi2.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi3.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi4.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi5.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi6.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi7.mp4");
        pathListGushi.add(FileUtils.getMovieCache()+"/gushi8.mp4");

    }

    public ArrayList<String> getPathListTongyao() {
        return pathListTongyao;
    }

    public ArrayList<String> getPathListGushi() {
        return pathListGushi;
    }
}
