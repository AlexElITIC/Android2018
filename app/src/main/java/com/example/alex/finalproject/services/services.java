package com.example.alex.finalproject.services;

import com.example.alex.finalproject.model.userClass;

public class services {
    public boolean validUser(userClass user, String password, String mail){
        return user!=null&&user.getPassword()==password && user.getMail()==mail;
    }
}
