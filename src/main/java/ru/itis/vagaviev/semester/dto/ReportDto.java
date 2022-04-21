package ru.itis.vagaviev.semester.dto;

import ru.itis.vagaviev.semester.model.Report;

public class ReportDto {
    private int id;
    private int userId;
    private long date;
    //2000
    private String text;

    public ReportDto(int id, Integer userId, long date, String text) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.text = text;
    }

    public ReportDto() {
    }

    public ReportDto formModel(Report report){
        return new ReportDto(
                report.getId(),
                report.getUserID(),
                report.getDate(),
                report.getText()
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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
