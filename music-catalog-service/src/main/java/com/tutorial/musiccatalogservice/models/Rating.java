package com.tutorial.musiccatalogservice.models;

public class Rating {
    private String musicId;
    private int rating;

    public Rating(String musicId, int rating) {
        this.musicId = musicId;
        this.rating = rating;
    }

    public String getmusicId() {
        return musicId;
    }

    public void setMovieId(String musicId) {
        this.musicId = musicId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
