package com.example.androidfeature;

import android.content.Intent;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button btnsound,btnprefe,btnloadimage,btnplayvideo,btnsplash,btnreadfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsound=findViewById(R.id.btnsound);
        btnprefe=findViewById(R.id.btnprefe);
        btnloadimage=findViewById(R.id.btnloadimage);
        btnplayvideo=findViewById(R.id.btnplayvideo);
        btnsplash=findViewById(R.id.btnsplash);
        btnreadfile=findViewById(R.id.btnreadfile);
        btnsound.setOnClickListener(this);
        btnprefe.setOnClickListener(this);
        btnloadimage.setOnClickListener(this);
        btnplayvideo.setOnClickListener(this);
        btnsplash.setOnClickListener(this);
        btnreadfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if(view.getId()==btnsound.getId()){

          MediaActionSound ms=new MediaActionSound();
          ms.play(Integer.parseInt("me"));
      }
      else if(view.getId()==btnprefe.getId()){

          Intent intent = new Intent(this, LoginActivity.class);
          startActivity(intent);
      }
      else if(view.getId()==btnloadimage.getId()){

          Intent intent = new Intent(this, ImageloadActivity.class);
          startActivity(intent);
      }
       else if(view.getId()==btnplayvideo.getId()){
          Intent intent = new Intent(this, VedioplayActivity.class);
          startActivity(intent);
        }
      else if(view.getId()==btnsplash.getId()){

          Intent intent = new Intent(this, SplashActivity.class);
          startActivity(intent);
      }
      else if(view.getId()==btnreadfile.getId()){
          Intent intent = new Intent(this, ReadTextFileActivity.class);
          startActivity(intent);
      }

    }
}