package ru.itis.vagaviev.semester.model;

import javax.persistence.*;

@Entity
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int userId;
    private long date;
    //2000
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userID) {
        this.userId = userID;
    }

    public Report(int id, int userId, long date, String text) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.text = text;
    }

    public Report(int userId, long date, String text) {
        this.userId = userId;
        this.date = date;
        this.text = text;
    }

    public Report() {
    }
}
