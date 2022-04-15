package ru.itis.vagaviev.semester.dto;

import javax.validation.constraints.NotBlank;

public class CreateUserDto {
    @NotBlank(message = "age shouldn't be blank!")
    private int age;

    private String name;
    private String surname;

    @NotBlank(message = "email shouldn't be blank!")
    private String email;

    private String status;

    @NotBlank(message = "login shouldn't be blank!")
    private String login;

    @NotBlank(message = "password shouldn't be blank!")
    private String password;

    private String imageUri;

    public CreateUserDto() {
    }

    public CreateUserDto(int age, String name, String surname, String email, String status, String login, String password, String imageUri) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.status = status;
        this.login = login;
        this.password = password;
        this.imageUri = imageUri;
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
}
