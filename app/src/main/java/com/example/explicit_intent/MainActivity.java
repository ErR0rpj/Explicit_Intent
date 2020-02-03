package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ETName;
    Button BTNAct2,BTNAct3;
    TextView TVResult;
    final int Resultfrom3=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETName = findViewById(R.id.ETName);         // These 4 lines are to give ID to variable so that we can know which Variable points to which.
        BTNAct2= findViewById(R.id.BTNAct2);
        BTNAct3= findViewById(R.id.BTNAct3);
        TVResult= findViewById(R.id.TVResult);

        BTNAct2.setOnClickListener(new View.OnClickListener() {         // This is to perform action after clicking the button.
            @Override
            public void onClick(View view) {
                if(ETName.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter all the fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    String name = ETName.getText().toString();

                    Intent intent = new Intent(MainActivity.this, com.example.explicit_intent.Activity2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });

        BTNAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,com.example.explicit_intent.Activity3.class);
                startActivityForResult(intent, Resultfrom3);

            }
        });

        String surname=getIntent().getStringExtra("surname");
        TVResult.setText(surname);
    }
}
