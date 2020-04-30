package com.glc.itbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {

private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        textView=findViewById(R.id.tv_1);

        Intent intent=getIntent();
        String username = intent.getStringExtra("username");
        textView.setText(username);


    }



}
