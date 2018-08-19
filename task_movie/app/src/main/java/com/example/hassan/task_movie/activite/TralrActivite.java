package com.example.hassan.task_movie.activite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.hassan.task_movie.R;
import com.example.hassan.task_movie.adaptors.Madaptor;
import com.example.hassan.task_movie.adaptors.Traleradapter;
import com.example.hassan.task_movie.model.TrailerRespones;
import com.example.hassan.task_movie.model.responses;
import com.example.hassan.task_movie.util.constant;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TralrActivite extends AppCompatActivity {

    @BindView(R.id.rececltraler)
    RecyclerView rececltraler;
    private RecyclerView.LayoutManager mlayoutManager;
    private Traleradapter traleradapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tralr_activite);
        ButterKnife.bind(this);
init();
        String movie_id = null;
        AndroidNetworking.get(constant.BASE_URL +"{movie_id}"+constant.VIDEOS)
                .addPathParameter("movie_id",movie_id)
                .addQueryParameter(constant.API_key,constant.API_VAL)
                .build()
                .getAsObject(TrailerRespones.class, new ParsedRequestListener<TrailerRespones>() {

                    @Override
                    public void onResponse(TrailerRespones response) {

                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });}
    private void init() {
        mlayoutManager=new LinearLayoutManager(this);
    }
}
