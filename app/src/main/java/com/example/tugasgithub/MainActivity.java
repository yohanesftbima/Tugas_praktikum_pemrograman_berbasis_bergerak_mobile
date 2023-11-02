package com.example.tugasgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.Toast);
        b.setOnClickListener(this);

    }
        @Override
        public void onClick(View view){
            Toast.makeText(this, " Nama: Yohanes Falentino Bima Nim : C2157201004", Toast.LENGTH_SHORT).show();
        }

    }
