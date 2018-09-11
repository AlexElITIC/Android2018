package com.example.alex.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.alex.finalproject.model.userClass;
import com.example.alex.finalproject.services.services;

public class LoginActivity extends AppCompatActivity {
    EditText editTextPassword;
    EditText editTextMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextPassword = findViewById(R.id.password);
        editTextMail = findViewById(R.id.email);
    }

    public void login(View view) {
        services UserService = new services();
        userClass user = new userClass();
        user.setName("Alex");
        user.setPassword("A01271558");
        user.setMail("A01271558@itesm.mx");
        if (UserService.validUser(user, editTextPassword.getText().toString(),editTextMail.getText().toString())){
            Toast.makeText(this, "Hola " + user.getName(), Toast.LENGTH_SHORT).show();
            intentToActivityMain();
        }
        else{
            Toast.makeText(this, "datos incorrectos", Toast.LENGTH_SHORT).show();
            
        }

    }

    private void intentToActivityMain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}
