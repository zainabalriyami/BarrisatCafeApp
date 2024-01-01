package com.example.barristacafe_19f19188;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PastaMenu extends AppCompatActivity {

    FloatingActionButton fab3;

    Button pasta1,pasta2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_menu);

        fab3= new FloatingActionButton(this);

        pasta1=(Button) findViewById(R.id.fabpasta1);
        pasta2=(Button) findViewById(R.id.fabpasta2);

        pasta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PastaMenu.this, PastaMenu.class);
                startActivity(intent);
                finish();
            }
        });
        pasta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PastaMenu.this, PastaMenu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}