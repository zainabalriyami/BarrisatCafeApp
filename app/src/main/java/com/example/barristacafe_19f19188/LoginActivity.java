package com.example.barristacafe_19f19188;


import static com.example.barristacafe_19f19188.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText pass;
    Button LoginButton,signup;

    private HelperClass HC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(android.R.layout.activity_list_item);

        HC = new HelperClass(this);

        username=(EditText) findViewById(R.id.UserName);
        pass=(EditText) findViewById(R.id.password);
        LoginButton=(Button) findViewById(R.id.LoginButton);
        signup=(Button)findViewById(R.id.btn1);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String un=username.getText().toString();
                String ps=username.getText().toString();

                if(HC.validateUser(un,ps)){

                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);


            }
        });
    }

    private void checkUser() {
    }

    public Boolean validateUserName(){
        String val = username.getText().toString();
        if (val.isEmpty()){
            username.setError("UserName Cannot be Empty");
            return false;

        }else{
            username.setError(null);
            return true;
        }

    }
    public Boolean validatePassword(){
        String val = pass.getText().toString();
        if (val.isEmpty()){
            pass.setError("Password Cannot be Empty");
            return false;

        }else{
            pass.setError(null);
            return true;
        }

    }

    public void CheckUser(){

        String userUsername = username.getText().toString().trim();
        String userPassword = pass.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUserDatabase = reference.orderByChild("username").equalTo(userUsername);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if (snapshot.exists()){
                    username.setError(null);
                    String passwordFromDB=snapshot.child(userUsername).child(userPassword).getValue(String.class);

                    if (!Objects.equals(passwordFromDB,userPassword)) {
                        pass.setError("Invalid Credentials");
                        pass.requestFocus();

                    } else {
                        username.setError(null);
                        Intent intent =new Intent(LoginActivity.this,SignUpActivity.class);
                        startActivity(intent);
                    }

                }else{
                    username.setError("User does not Exist");
                    username.requestFocus();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}