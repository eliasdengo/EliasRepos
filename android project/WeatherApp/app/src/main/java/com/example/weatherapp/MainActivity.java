package com.example.weatherapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  Button btncityid,btnweatherbyid,btnweatherbyname;
  EditText et_cityname;
  ListView lv_weatherReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign value
        btncityid=findViewById(R.id.btncityid);
        btnweatherbyid=findViewById(R.id.btnweatherbyid);
        btnweatherbyname=findViewById(R.id.btnweatherbyname);
        et_cityname=findViewById(R.id.et_cityname);
        lv_weatherReport=findViewById(R.id.lv_weatherReport);

        //click listener

        btncityid.setOnClickListener(view -> Toast.makeText(MainActivity.this, "is it click ? 1", Toast.LENGTH_SHORT).show());
        btnweatherbyid.setOnClickListener(view -> Toast.makeText(MainActivity.this, "is it click ? 2", Toast.LENGTH_SHORT).show());
        btnweatherbyname.setOnClickListener(view -> Toast.makeText(MainActivity.this, "You Typed"+et_cityname.getText().toString(), Toast.LENGTH_SHORT).show());


    }
}