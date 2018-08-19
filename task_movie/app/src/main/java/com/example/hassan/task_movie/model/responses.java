package com.example.hassan.task_movie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Hassan on 2/16/2018.
 */

public class responses {
    public List<com.example.hassan.task_movie.model.movies> getMovies() {
        return movies;
    }

    public void setMovies(List<com.example.hassan.task_movie.model.movies> movies) {
        this.movies = movies;
    }

    @SerializedName("results")
    private List<movies> movies;

    private String page;

    private String total_pages;

    private String total_results;


    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getTotal_pages ()
    {
        return total_pages;
    }

    public void setTotal_pages (String total_pages)
    {
        this.total_pages = total_pages;
    }

    public String getTotal_results ()
    {
        return total_results;
    }

    public void setTotal_results (String total_results)
    {
        this.total_results = total_results;
    }


}
