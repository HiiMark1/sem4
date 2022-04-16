package ru.itis.vagaviev.semester.dto;

import ru.itis.vagaviev.semester.model.User;

public class UserDto {
    private int id;
    private int age;
    private String name;
    private String surname;
    private String email;
    private String status;
    private String login;
    private String password;
    private String imageUri;

    public UserDto() {
    }

    public UserDto(int id, int age, String name, String surname, String email, String status, String login, String password, String imageUri) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.status = status;
        this.login = login;
        this.password = password;
        this.imageUri = imageUri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public static UserDto fromModel(User user) {
        return new UserDto(user.getId(), user.getAge(), user.getName(), user.getSurname(), user.getEmail(),
        user.getStatus(), user.getLogin(), user.getPassword(), user.getImageUri());
    }
}
