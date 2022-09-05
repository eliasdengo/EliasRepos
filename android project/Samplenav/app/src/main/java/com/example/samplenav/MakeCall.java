package com.example.samplenav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakeCall extends AppCompatActivity implements View.OnClickListener {

     EditText txtp;
     Button btncall;
     Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_call);
        context=this;
        txtp=findViewById(R.id.txtp);
        btncall=findViewById(R.id.btncall);
        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        makeCall(txtp.getText().toString());
    }
    void makeCall( String phone){
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(" Tel:"+phone));
        context.startActivity(intent);
    }
}