package com.example.barristacafe_19f19188;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PizzaMenu extends AppCompatActivity{

  FloatingActionButton fab;

  Button pizza1,pizza2,pizza3;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);

        fab = new FloatingActionButton(this);

        pizza1=(Button) findViewById(R.id.fabpizza1);
        pizza2=(Button) findViewById(R.id.fabpizza2);
        pizza3=(Button) findViewById(R.id.fabpizza3);


        pizza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaMenu.this, PizzaMenu.class);
                startActivity(intent);
                finish();
            }
        });

        pizza2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaMenu.this, PizzaMenu.class);
                startActivity(intent);
                finish();
            }
        });

        pizza3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaMenu.this, PizzaMenu.class);
                startActivity(intent);
                finish();
            }
        });


    }}
