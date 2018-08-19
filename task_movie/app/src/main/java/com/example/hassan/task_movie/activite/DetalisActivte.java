package com.example.hassan.task_movie.activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hassan.task_movie.R;
import com.example.hassan.task_movie.util.constant;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalisActivte extends AppCompatActivity {

    @BindView(R.id.imgcaver)
    ImageView imgCaver;
    @BindView(R.id.img_v_poster)
    ImageView imgVPoster;
    @BindView(R.id.tv_movi_Titel)
    TextView tvMoviTitel;
    @BindView(R.id.tvRating)
    TextView tVRating;
    @BindView(R.id.tv_movidate)
    TextView tvMovidate;
    @BindView(R.id.movidscraption)
    TextView moviDscraption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis_activte2);
        ButterKnife.bind(this);
        String cover =getIntent().getExtras().getString(constant.Extra.COVER);
        String poster =getIntent().getExtras().getString(constant.Extra.POSTER);
        String title =getIntent().getExtras().getString(constant.Extra.TITLR);
        String date =getIntent().getExtras().getString(constant.Extra.date);
        String description =getIntent().getExtras().getString(constant.Extra.description);
        String rate =getIntent().getExtras().getString(constant.Extra.rate);
        Picasso.with(this)
                .load(constant.BASE_IMG_URL +cover)
                .into(imgCaver);
                Picasso.with(this)
                .load(constant.BASE_IMG_URL +poster)
                .into(imgVPoster);
                tvMoviTitel.setText(title);
                tvMovidate.setText(date);
                tVRating.setText(rate);
                moviDscraption.setText(description);

    }
}
