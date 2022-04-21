package ru.itis.vagaviev.semester.dto;

import ru.itis.vagaviev.semester.model.Comment;

public class CommentDto {
    private int id;
    private int userId;
    private long date;
    //1000
    private String text;
    private int postId;

    public CommentDto formModel(Comment comment){
        return new CommentDto(
                comment.getId(),
                comment.getUserId(),
                comment.getDate(),
                comment.getText(),
                comment.getPostId()
        );
    }

    public CommentDto(int id, int userId, long date, String text, int postId) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.text = text;
        this.postId = postId;
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
