package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2,edit3;
    Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.editText1);
        edit2=findViewById(R.id.editText2);
        edit3=findViewById(R.id.editText3);
        btnadd=findViewById(R.id.btnsub);
    }

    public void addnumber(View view) {
        int fnum=Integer.parseInt(edit1.getText().toString());
        int snum=Integer.parseInt(edit2.getText().toString());
        int sum=fnum + snum;
        edit3.setText(String.valueOf(sum));
    }

    public void subnumber(View view) {
        int fnum=Integer.parseInt(edit1.getText().toString());
        int snum=Integer.parseInt(edit2.getText().toString());
        int sub=fnum - snum;
        edit3.setText(String.valueOf(sub));
    }

}