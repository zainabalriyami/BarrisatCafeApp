package com.example.barristacafe_19f19188;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StrartersMenu extends AppCompatActivity {

    FloatingActionButton fab3;

    Button start1,start2,start3,start4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strarters_menu);

        fab3=new FloatingActionButton(this);

        start1=(Button) findViewById(R.id.fabstarter1);
        start2=(Button) findViewById(R.id.fabstar2);
        start3=(Button) findViewById(R.id.fabstart3);
        start4=(Button) findViewById(R.id.fabstart4);



        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StrartersMenu.this, StrartersMenu.class);
                startActivity(intent);
                finish();
            }
        });
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StrartersMenu.this, StrartersMenu.class);
                startActivity(intent);
                finish();
            }
        });
        start3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StrartersMenu.this, StrartersMenu.class);
                startActivity(intent);
                finish();
            }
        });
        start4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StrartersMenu.this, StrartersMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}