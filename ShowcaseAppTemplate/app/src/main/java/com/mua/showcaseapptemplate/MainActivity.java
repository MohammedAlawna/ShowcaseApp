package com.mua.showcaseapptemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    EditText loginInputTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        loginBtn = findViewById(R.id.loginButton);
        loginInputTxt = findViewById(R.id.name);




        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToAnotherActivity();
                System.out.println("LoggedIn with name");
            }
        });

    }

    void GoToAnotherActivity() {
        //Intent intent = new Intent(this, MainMenu.class);
        String str = loginInputTxt.getText().toString();
        Intent intent = new Intent(getApplicationContext(), MainMenu.class);
        intent.putExtra("name", str);
        startActivity(intent);
    }
}