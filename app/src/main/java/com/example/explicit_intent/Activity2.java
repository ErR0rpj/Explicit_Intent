package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {

    TextView TVact2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TVact2= findViewById(R.id.TVact2);

        String name=getIntent().getStringExtra("name");
        TVact2.setText(name+",Welcome to GOA Singham");
    }
}
