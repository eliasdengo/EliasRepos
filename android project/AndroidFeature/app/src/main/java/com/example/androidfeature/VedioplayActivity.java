package com.example.androidfeature;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VedioplayActivity extends AppCompatActivity implements View.OnClickListener {
   Button btnpv;
   VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedioplay);

        btnpv=findViewById(R.id.btnpv);
        vv=findViewById(R.id.vv);
        btnpv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    VideoView vvt=findViewById(R.id.vv);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.android1);
        vvt.setVideoURI(uri);
        vvt.start();
    }
}