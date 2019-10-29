package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView name;
        TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);

    }
    public void check (View view){
        int number = Integer.parseInt(edNumber.getText().toString());


    }
}

