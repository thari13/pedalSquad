package com.example.pedalSquad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity<list> extends AppCompatActivity {
    Button buttonViewBicycle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonViewBicycle=(Button) findViewById(R.id.buttonViewBicycle);
        buttonViewBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewActivity();

            }
        });

        //Spinner Element
        Spinner spinner= (Spinner) findViewById(R.id.spinnerType);
        //Spinner click listener
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        //Spinner drop down elements
        List<String> categories=new ArrayList<String>();
        categories.add("Kids");
        categories.add("Ladies");
        categories.add("Geared");
        categories.add("Electric");
        //creating adapter for spinner
        ArrayAdapter<String> dataAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        //dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    public void openViewActivity(){
        Intent intent = new Intent (this,ViewActivity.class);
        startActivity(intent);
    }






}