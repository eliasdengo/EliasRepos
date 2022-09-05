package com.example.androidfeature;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvname,tvpass;
    EditText etname,etpass;
    CheckBox cb;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvname=findViewById(R.id.tvname);
        etname=findViewById(R.id.etname);
        tvpass=findViewById(R.id.tvpass);
        etpass=findViewById(R.id.etPass);
        cb=findViewById(R.id.cbrem);
        btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        SharedPreferences spf=this.getSharedPreferences("LoginSetting",0);
        String name=spf.getString("username","");
        String password=spf.getString("password","");
        etname.setText(name);
        etpass.setText(password);
    }

    @Override
    public void onClick(View view) {
       if(cb.isChecked()){
           SharedPreferences sp=getSharedPreferences("LoginSetting",0);
            SharedPreferences.Editor edit=sp.edit();
           edit.putString("username",etname.getText().toString());
           edit.putString("password",etpass.getText().toString());
           edit.apply();

           Toast.makeText(this, "Setting Save", Toast.LENGTH_SHORT).show();

       }
       else
       {
           Toast.makeText(this, "Setting not Save", Toast.LENGTH_SHORT).show();
       }
    }
}