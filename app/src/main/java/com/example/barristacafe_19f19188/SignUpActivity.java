package com.example.barristacafe_19f19188;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {

    EditText Name,Pass,Email;
   Button Signup ;
   FirebaseDatabase database;
   DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_sign_up);

        Name=(EditText) findViewById(R.id.UserName);
        Pass=(EditText) findViewById(R.id.password);
        Email=(EditText) findViewById(R.id.Email);
        Signup=(Button) findViewById(R.id.bt);


        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                database= FirebaseDatabase.getInstance();
                reference= database.getReference("User");

                String name= Name.getText().toString();
                String email= Email.getText().toString();
                String pass= Pass.getText().toString();

                HelperClass helperClass =new HelperClass(name, pass, email);
                reference.child(name).setValue(helperClass);

                Toast.makeText(SignUpActivity.this,"You have SignUp Successfully",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(SignUpActivity.this, Log.class);
                startActivity(intent);
            }
        });





    }
}