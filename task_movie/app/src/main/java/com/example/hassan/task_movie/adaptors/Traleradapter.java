package com.example.hassan.task_movie.adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hassan.task_movie.R;
import com.example.hassan.task_movie.model.Trailer;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Traleradapter extends RecyclerView.Adapter<Traleradapter.TrailersHolder> {
    private Context Tcontext;
    private List<Trailer> trailerList;

    public Traleradapter(Context tcontext, List<Trailer> trailerList) {
        Tcontext = tcontext;
        this.trailerList = trailerList;
    }

    @Override
    public TrailersHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(Tcontext).inflate(R.layout.item_trailers, parent, false);

        return new TrailersHolder(view);
    }

    @Override
    public void onBindViewHolder(TrailersHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return trailerList.size();
    }

    public class TrailersHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.Trailer_image)
        ImageView TrailerImage;
        @BindView(R.id.Trailer_titel)
        TextView TrailerTitel;

        public TrailersHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }


}
