package com.example.samplenav;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LocalStorage extends AppCompatActivity implements View.OnClickListener {
   RadioButton rdamharic,rdenglish;
    //RadioGroup rdgsetting;
    Button btnsetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_storage);
        btnsetting=findViewById(R.id.btnsetting);
        rdamharic=findViewById(R.id.rdAmharic);
        rdenglish=findViewById(R.id.rdEnglish);
        btnsetting.setOnClickListener(this);
        SharedPreferences sp=getSharedPreferences("LanguageSetting",MODE_PRIVATE);
        String lang=sp.getString("Language","None");

        if(lang.equals("English")){
      rdenglish.isChecked();
        }else if(lang.equals("Amharic")){
      rdamharic.isChecked();
        }else{
            rdamharic.isChecked();
            rdenglish.isChecked();
        }
    }

    @SuppressLint("CommitPrefEdits")
    @Override
    public void onClick(View view) {
        SharedPreferences sp=getSharedPreferences("LanguageSetting",MODE_PRIVATE);
        SharedPreferences.Editor spe = sp.edit();

        if(rdamharic.isChecked()){
            spe.putString("Language","Amharic");
        }else{
            spe.putString("Language","English");
        }
        spe.apply();

        Toast.makeText(this, "Setting Save", Toast.LENGTH_SHORT).show();

    }
}