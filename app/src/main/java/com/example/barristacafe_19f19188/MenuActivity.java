package com.example.barristacafe_19f19188;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MenuActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    Button fabpizza, fabsalad, fabstarters, fabdrinks, fabpasta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        floatingActionButton =new FloatingActionButton(this);

        fabpizza=(Button) findViewById(R.id.fabpizza);
        fabsalad=(Button) findViewById(R.id.fabsalad);
        fabstarters=(Button) findViewById(R.id.fabStarters);
        fabdrinks=(Button) findViewById(R.id.fabDrinks);
        fabpasta=(Button) findViewById(R.id.fabpasta);

        fabpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PizzaMenu.class);
                startActivity(intent);
                finish();
            }
        });
        fabsalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SaladMenu.class);
                startActivity(intent);
                finish();
            }
        });

        fabstarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, StrartersMenu.class);
                startActivity(intent);
                finish();
            }
        });
        fabdrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, drinks.class);
                startActivity(intent);
                finish();
            }
        });

        fabpasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PastaMenu.class);
                startActivity(intent);
                finish();
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            private android.view.View View;

            @Override
            public void onClick(View v) {
                Snackbar.make(View, "Button Clicked!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}