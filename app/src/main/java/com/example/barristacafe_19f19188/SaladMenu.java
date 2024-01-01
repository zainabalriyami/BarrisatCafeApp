package com.example.barristacafe_19f19188;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class SaladMenu extends AppCompatActivity {

    FloatingActionButton fab2;

    Button salad1,salad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad_menu);

        fab2 = new FloatingActionButton(this);

        salad1=(Button) findViewById(R.id.fabsalad1);
        salad2=(Button) findViewById(R.id.fabsalad2);


        salad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladMenu.this, SaladMenu.class);
                startActivity(intent);
                finish();
            }
        });
        salad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladMenu.this, SaladMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}