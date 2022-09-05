package com.example.smsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;
    EditText etn1,etn2;
    Button btnsend,btnclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        etn1=findViewById(R.id.etn1);
        tv2=findViewById(R.id.tv2);
        etn2=findViewById(R.id.etn2);
        btnsend=findViewById(R.id.btnsend);
        btnclear=findViewById(R.id.btnclear);
    }

    public void send(android.view.View view){

        SmsMessage.getSubmitPdu("0910899262", etn1.getText().toString(), etn2.getText().toString(), true);
        Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();

    }
    public void clear(android.view.View view){
        etn1.setText("");
        etn2.setText("");
    }
}