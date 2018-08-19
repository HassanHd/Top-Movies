package com.example.hassan.task_movie.application;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by Hassan on 2/16/2018.
 */

public class MoviesApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
    }
}
