package com.example.myapplication;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    String nameUser;
    Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miBoton = findViewById(R.id.login);

        miBoton.setOnClickListener(click2);
    }
    View.OnClickListener click2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            etName = findViewById(R.id.et_name);
            nameUser = String.valueOf(etName.getText());
            Intent intent = new Intent(MainActivity.this,FroilanCanul2.class);
            intent.putExtra("Usuario", nameUser);
            startActivity(intent);


            /*etName = findViewById(R.id.et_name);
            nameUser = String.valueOf(etName.getText());
            Toast.makeText(getBaseContext(),  "Hola"+ nameUser, Toast.LENGTH_SHORT).show();*/
        }
    };
    /*public void clic(View view){
        etName = findViewById(R.id.et_name);
        nameUser = String.valueOf(etName.getText());
        Toast.makeText(getBaseContext(),  "Hola"+nameUser, Toast.LENGTH_SHORT).show();

    }*/
}