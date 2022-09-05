package com.example.samplenav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button btnSendSms,btnMakeCall,btnLocalStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSendSms=findViewById(R.id.btnSendSms);
        btnMakeCall=findViewById(R.id.btnMakeCall);
        btnLocalStorage=findViewById(R.id.btnLocalStorage);
        btnSendSms.setOnClickListener(this);
        btnMakeCall.setOnClickListener(this);
        btnLocalStorage.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    if(view.getId()==btnSendSms.getId()){
        //Toast.makeText(this, "send sms", Toast.LENGTH_SHORT).show();
        Intent sendsms=new Intent(this,SendSms.class);
        startActivity(sendsms);
    } else if(view.getId()==btnMakeCall.getId()){
        //Toast.makeText(this, "make call", Toast.LENGTH_SHORT).show();
        Intent makecall=new Intent(this,MakeCall.class);
        startActivity(makecall);
    } else if(view.getId()==btnLocalStorage.getId()){
        //Toast.makeText(this, "use local storage", Toast.LENGTH_SHORT).show();
        Intent localstorage=new Intent(this,LocalStorage.class);
        startActivity(localstorage);
    }
    }
}