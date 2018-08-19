package com.example.hassan.task_movie.adaptors;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hassan.task_movie.R;
import com.example.hassan.task_movie.activite.DetalisActivte;
import com.example.hassan.task_movie.activite.MainActivity;
import com.example.hassan.task_movie.model.movies;
import com.example.hassan.task_movie.model.responses;
import com.example.hassan.task_movie.util.constant;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hassan on 2/16/2018.
 */

public class Madaptor extends RecyclerView.Adapter<Madaptor.Mviewholder> {

    private Context mc;
    protected List<movies> iteamms;

    public Madaptor(Context mc, List<movies> iteamms) {
        this.mc = mc;
        this.iteamms = iteamms;
    }

    @Override
    public Mviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater x = LayoutInflater.from(mc);
        View view = x.inflate(R.layout.cardmovies, parent, false);
        Mviewholder holder = new Mviewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Mviewholder holder, int position) {
        final movies movies= iteamms.get(position);
        holder.imgCardMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mc, DetalisActivte.class);
                intent.putExtra(constant.Extra.COVER,movies.getBackdrop_path());
                intent.putExtra(constant.Extra.TITLR,movies.getTitle());
                intent.putExtra(constant.Extra.POSTER,movies.getPoster_path());
                intent.putExtra(constant.Extra.rate,movies.getVote_average());
                intent.putExtra(constant.Extra.date,movies.getRelease_date());
                intent.putExtra(constant.Extra.description,movies.getOverview());
                mc.startActivity(intent);
            }
        });
        Picasso.with(mc)
                .load(constant.BASE_IMG_URL+movies.getPoster_path())
                .placeholder(R.drawable.ss)
                .into(holder.imgCardMove);

    }

    @Override
    public int getItemCount() {
        return iteamms.size();
    }

    public class Mviewholder extends RecyclerView.ViewHolder {
        @BindView(R.id.CardMove)
        CardView cardView;
        @BindView(R.id.imgCardMove)
        ImageView imgCardMove;
        public Mviewholder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }


}
