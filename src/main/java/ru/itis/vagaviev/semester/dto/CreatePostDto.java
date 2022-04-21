package ru.itis.vagaviev.semester.dto;

import javax.validation.constraints.NotBlank;

public class CreatePostDto {
    private int userId;
    private String date;
    int rating;
    @NotBlank(message = "text shouldn't be blank!")
    private String text;
    private String picUrl;
    @NotBlank(message = "name shouldn't be blank!")
    private String name;

    public CreatePostDto() {
    }

    public CreatePostDto(int userId, String date, int rating, String text, String picUrl, String name) {
        this.userId = userId;
        this.date = date;
        this.rating = rating;
        this.text = text;
        this.picUrl = picUrl;
        this.name = name;
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
