package com.example.hassan.task_movie.model;

import com.google.gson.annotations.SerializedName;

public class Trailer {
    @SerializedName("id")
    private String id;
    @SerializedName("key")
    private String key;
    @SerializedName("site")
    private String site;
    @SerializedName("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
