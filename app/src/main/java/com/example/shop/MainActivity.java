package com.example.shop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView name;
        TextView password;
        TextView namewarn;
        TextView passwarn;
        ImageView namewarnpic;
        ImageView passwarnpic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        namewarn = findViewById(R.id.namewarn);
        password = findViewById(R.id.password);
        passwarn = findViewById(R.id.passwarn);
        passwarnpic =findViewById(R.id.passwarnpic);
        namewarnpic = findViewById(R.id.namewarnpic);
     }
    public void check (View view){
        String namew = name.getText().toString();
        String passw = password.getText().toString() ;
        if(passw.length() < 8){
            passwarn.setText("Password too SHORT!");
            passwarnpic.setVisibility(View.INVISIBLE);
        }else{
            passwarn.setText("");
            passwarnpic.setVisibility(View.VISIBLE);
        };
        if(namew.length() < 6){
            namewarn.setText("Name too SHORT!");
            namewarnpic.setVisibility(View.INVISIBLE);
        }else{
            namewarn.setText("");
            namewarnpic.setVisibility(View.VISIBLE);
        };
        if(namew.length()>=6 && passw.length() >=8)
        {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Great")
                    .setMessage("Welcome!")
                    .setPositiveButton("OK",null)
                    .show();
        }




    }
}

