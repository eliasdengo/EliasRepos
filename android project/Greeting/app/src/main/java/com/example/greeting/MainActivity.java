package com.example.greeting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 TextView lblname,lblhello;
 EditText editname;
 Button btnsay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblname=findViewById(R.id.lblname);
        editname=findViewById(R.id.editname);
        btnsay=findViewById(R.id.btnsay);
        lblhello=findViewById(R.id.lblhello);
    }

    public void sayHello(View view) {
        String name=editname.getText().toString();
        String greeting="Hi  "+name;
        lblhello.setText(greeting);
    }
}