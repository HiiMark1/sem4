package ru.itis.vagaviev.semester.dto;

import javax.validation.constraints.NotBlank;

public class CreateMessageDto {
    @NotBlank(message = "text shouldn't be blank!")
    private String text;
    private int fromUserId;
    private int toUserId;
    private long date;
    @NotBlank(message = "name shouldn't be blank!")
    private String name;

    public CreateMessageDto() {
    }

    public CreateMessageDto(String text, int fromUserId, int toUserId, long date, String name) {
        this.text = text;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.date = date;
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
