package com.example.alex.finalproject.model;

public class userClass implements user {
    private String name;
    private String password;
    private String mail;

    @Override
    public void setMail(String mail) {
        this.mail=mail;
    }
    @Override
    public void addCard() {

    }

    @Override
    public void deleteCard() {

    }

    @Override
    public void editCard() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String getMail() {
        return mail;
    }

}
