package ru.itis.vagaviev.semester.dto;

import ru.itis.vagaviev.semester.model.Message;
import ru.itis.vagaviev.semester.model.User;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class MessageDto {
    private int id;
    private String text;
    private int fromUserId;
    private int toUserId;
    private long date;
    private String name;

    public static MessageDto formModel(Message message){
        return new MessageDto(
                message.getId(),
                message.getText(),
                message.getFromUserId(),
                message.getToUserId(),
                message.getDate(),
                message.getName()
        );
    }

    public MessageDto(int id, String text, int fromUserId, int toUserId, long date, String name) {
        this.id = id;
        this.text = text;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
