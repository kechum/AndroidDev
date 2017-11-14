package com.tutorials.hackro.androiddev.presentation.entity;

/**
 * Created by macbookpro on 13/11/17.
 */

public class ArticleDetails {

    private String id_post;
    private String score;
    private String comments;
    private String urlPicture;
    private String title;

    public ArticleDetails(String id_post, String score, String comments, String urlPicture, String title) {
        this.id_post = id_post;
        this.score = score;
        this.comments = comments;
        this.urlPicture = urlPicture;
        this.title = title;
    }

    public ArticleDetails() {}

    public String getId_post() {
        return id_post;
    }

    public void setId_post(String id_post) {
        this.id_post = id_post;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "ArticleDetails{" +
                "id_post='" + id_post + '\'' +
                ", score='" + score + '\'' +
                ", comments='" + comments + '\'' +
                ", urlPicture='" + urlPicture + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
