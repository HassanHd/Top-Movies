package com.example.hassan.task_movie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrailerRespones {
    @SerializedName("id")
    private int id;
    @SerializedName("results")
    private List<Trailer> trailers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Trailer> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<Trailer> trailers) {
        this.trailers = trailers;
    }
}
