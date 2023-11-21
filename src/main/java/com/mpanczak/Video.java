package com.mpanczak;

public class Video {
    private long id;
    private String title;
    private String url;

    public Video(long id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
