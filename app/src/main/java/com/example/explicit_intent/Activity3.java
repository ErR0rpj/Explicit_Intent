package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    EditText ETsur;
    Button BTNsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        ETsur= findViewById(R.id.ETsur);
        BTNsubmit= findViewById(R.id.BTNsubmit);

        BTNsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ETsur.getText().toString().isEmpty()){
                    Toast.makeText(Activity3.this,"Bsdk Bhar na pehle",Toast.LENGTH_SHORT).show();
                }
                else{
                    String surname = ETsur.getText().toString();
                    Intent intent = new Intent(Activity3.this, com.example.explicit_intent.MainActivity.class);
                    intent.putExtra("surname", surname);
                    startActivity(intent);
                }
            }
        });
    }
}
