package com.example.alex.finalproject.services;

import com.example.alex.finalproject.model.userClass;

public class services {
    public boolean validUser(userClass user, String password, String mail){

        if (user!=null&&user.getPassword().equals(password) && user.getMail().equals(mail))
        return true;
        else return false;
    }
}
