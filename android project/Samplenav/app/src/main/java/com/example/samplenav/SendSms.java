package com.example.samplenav;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SendSms extends AppCompatActivity implements View.OnClickListener {
 EditText txtmessage,txtphone;
 Button btnsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);
        txtmessage=findViewById(R.id.txtmessage);
        txtphone= findViewById(R.id.txtphone);
        btnsend=findViewById(R.id.btnsend);
    }

    @Override
    public void onClick(View view) {
     sendSms(txtphone.getText().toString(),txtmessage.getText().toString());
        Toast.makeText(this, "Message Successfully sent", Toast.LENGTH_SHORT).show();

    }

    void sendSms(String phone,String message){
        @SuppressLint("UnspecifiedImmutableFlag")
        PendingIntent pi=PendingIntent.getActivity(this,0,new Intent(this,SendSms.class),0);
        SmsManager smsm=SmsManager.getDefault();
        smsm.sendTextMessage( phone,null,message,pi,null);
    }
}