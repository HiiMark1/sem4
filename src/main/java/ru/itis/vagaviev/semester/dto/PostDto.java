package ru.itis.vagaviev.semester.dto;

import ru.itis.vagaviev.semester.model.Post;
import ru.itis.vagaviev.semester.model.User;

public class PostDto {
    private int id;
    private int userId;
    private String date;
    int rating;
    //2000
    private String text;
    private String picUrl;
    //100
    private String name;

    public PostDto(int id, Integer userId, String date, int rating, String text, String picUrl, String name) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.rating = rating;
        this.text = text;
        this.picUrl = picUrl;
        this.name = name;
    }

    public PostDto formModel(Post post){
        return new PostDto(post.getId(),
                post.getUserId(),
                post.getDate(),
                post.getRating(),
                post.getText(),
                post.getPicUrl(),
                post.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
