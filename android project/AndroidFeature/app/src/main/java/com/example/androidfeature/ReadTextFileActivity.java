package com.example.androidfeature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTextFileActivity extends AppCompatActivity implements View.OnClickListener {
Button ReadFromFile;
EditText txtFileContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_text_file);
        ReadFromFile=findViewById(R.id.ReadFromFile);
        txtFileContent=findViewById(R.id.txtFileContent);
        ReadFromFile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        BufferedReader br=null;
        StringBuilder sb=new StringBuilder();
        try{
            br=new BufferedReader(new InputStreamReader(this.getAssets().open("test.txt")));
            String mLine;
            while ((mLine=br.readLine())!=null){
                sb.append(mLine);
            }

           txtFileContent.setText(sb);
        }catch (Exception ex){
      txtFileContent.setText("");
        }finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}