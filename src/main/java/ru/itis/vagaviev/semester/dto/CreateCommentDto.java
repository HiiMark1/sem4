package ru.itis.vagaviev.semester.dto;

public class CreateCommentDto {
    private int userId;
    private long date;
    private String text;
    private int postId;

    public CreateCommentDto(int userId, long date, String text, int postId) {
        this.userId = userId;
        this.date = date;
        this.text = text;
        this.postId = postId;
    }

    public CreateCommentDto() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
}
