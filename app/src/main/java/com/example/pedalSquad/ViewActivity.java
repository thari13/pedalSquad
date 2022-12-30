package com.example.pedalSquad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewActivity extends AppCompatActivity {
    Button buttonBack2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        buttonBack2 = (Button) findViewById(R.id.buttonBack2);
        buttonBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent (this,MainActivity.class);
        startActivity(intent);
    }
}