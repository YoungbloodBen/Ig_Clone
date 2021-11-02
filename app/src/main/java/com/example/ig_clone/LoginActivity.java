package com.example.ig_clone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseUser;

import java.text.ParseException;

public class LoginActivity extends AppCompatActivity {
    public static final String TAG = "LoginActivity";
    private TextView etUsername;
    private TextView etPassword;
    private Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (ParseUser.getCurrentUser() != null){
            goMainActivity();
        }

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                loginUser (username, password);
            }


        });

    }
    private void loginUser(String username, String password) {

        ParseUser.logInInBackground(username, password, new LogInCallback(){
                    @Override
                    public void done(ParseUser user, com.parse.ParseException e) {
                        if (e != null){
                            Log.e(TAG, "issue with login", e);
                            return;
                        }

                        goMainActivity();
                        Toast.makeText(LoginActivity.this, "Success!", Toast.LENGTH_SHORT);
                    }

                    });

    }
    private void goMainActivity(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }



}