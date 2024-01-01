package com.example.barristacafe_19f19188;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class category extends AppCompatActivity {
    Button Menu;
    Button ABTUs;
    Button ContactUs;
    Button Location;



    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Menu = findViewById(R.id.menuName);
        ABTUs = findViewById(R.id.abUsName);
        ContactUs = findViewById(R.id.contentName);
        Location = findViewById(R.id.branchNam);


        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ABTUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(category.this, ABTUs.class);
                startActivity(intent);
                finish();
            }
        });

        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(category.this, ContactUs.class);
                startActivity(intent);
                finish();
            }
        });

        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this, Location.class);
                startActivity(intent);
                finish();
            }
        });


    }

 }