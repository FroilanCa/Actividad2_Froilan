package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FroilanCanul2 extends AppCompatActivity {
    TextView nameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_froilan_canul2);
        Bundle valores = getIntent().getExtras();
        String user = valores.getString("Usuario");

        nameUser = findViewById(R.id.tvuser);
        nameUser.setText(user);
    }
}