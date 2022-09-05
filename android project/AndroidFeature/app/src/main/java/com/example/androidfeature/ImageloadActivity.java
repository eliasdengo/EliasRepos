package com.example.androidfeature;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;

public class ImageloadActivity extends AppCompatActivity implements View.OnClickListener {
 Button btnli;
 ImageView ivli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageload);

        btnli=findViewById(R.id.btnli);
        ivli=findViewById(R.id.ivli);
        btnli.setOnClickListener(this);
    }


    private void LoadImage(String filename,ImageView imageView){
        AssetManager am=getAssets();
        try{
            InputStream is=am.open(filename);
            imageView.setImageBitmap(BitmapFactory.decodeStream(is));

            }catch (Exception ex){

         ex.printStackTrace();
                                  }
    }
    @Override
    public void onClick(View view) {
   LoadImage("join.png",ivli);
    }
}