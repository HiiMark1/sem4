package ru.itis.vagaviev.semester.dto;

import javax.validation.constraints.NotBlank;

public class CreateReportDto {
    private int userId;
    private long date;
    @NotBlank(message = "text shouldn't be blank!")
    private String text;

    public CreateReportDto(int userId, long date, String text) {
        this.userId = userId;
        this.date = date;
        this.text = text;
    }

    public CreateReportDto() {
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
}
