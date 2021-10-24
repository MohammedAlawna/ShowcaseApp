package com.mua.showcaseapptemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        nameText = findViewById(R.id.yourName);
        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        nameText.setText(str);
    }
}