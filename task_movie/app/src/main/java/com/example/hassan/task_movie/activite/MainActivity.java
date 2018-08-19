package com.example.hassan.task_movie.activite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.hassan.task_movie.R;
import com.example.hassan.task_movie.adaptors.Madaptor;
import com.example.hassan.task_movie.model.responses;
import com.example.hassan.task_movie.util.constant;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.receclmove)
    RecyclerView receclmove;
    @BindView(R.id.progrespar_move)
    ProgressBar progresparMove;
    private RecyclerView.LayoutManager mlayoutManager;
private Madaptor madaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
       mlayoutManager=new GridLayoutManager(this,2);
       receclmove .setLayoutManager(mlayoutManager);
      loadMovies(constant.POPLUER_MOVIES_KEY);


    }

    private void loadMovies(String tyPe) {
        progresparMove.setVisibility(View.VISIBLE);
        AndroidNetworking.get(constant.BASE_URL+tyPe)
                .addQueryParameter(constant.API_key,constant.API_VAL)
                .build()
                .getAsObject(responses.class, new ParsedRequestListener<responses>() {
                    @Override
                    public void onResponse(responses response) {
                        progresparMove.setVisibility(View.INVISIBLE);
                        madaptor=new Madaptor(MainActivity.this,response.getMovies());
                        receclmove.setAdapter(madaptor);
                    }

                    @Override
                    public void onError(ANError anError) {
                        progresparMove.setVisibility(View.INVISIBLE);
                        Toast.makeText(MainActivity.this, anError.getErrorDetail(), Toast.LENGTH_SHORT).show();

                    }
                });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.populer:
                loadMovies(constant.POPLUER_MOVIES_KEY);
                return true;
            case  R.id.top_Ratd:
                loadMovies(constant.TOP_RATED_MOVIES_KEY );
                return true;
        }
        return super.onOptionsItemSelected(item);

}}
