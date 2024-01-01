package com.example.barristacafe_19f19188;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class drinks extends AppCompatActivity {


    FloatingActionButton fab4;
    Button drink1,drink2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        fab4 =new FloatingActionButton(this);

        drink1=(Button) findViewById(R.id.fabdrink1);
        drink2=(Button) findViewById(R.id.fabdrink2);


        drink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(drinks.this, drinks.class);
                startActivity(intent);
                finish();
            }
        });

        drink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(drinks.this, drinks.class);
                startActivity(intent);
                finish();
            }
        });
    }
}