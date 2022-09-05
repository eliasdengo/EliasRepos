package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public Connection connectionClass(){
        Connection con=null;
        String ip="127.0.0.1",port="1433",username="sa",password="pro71",database="mydbandroid";
        return con;
    }
}