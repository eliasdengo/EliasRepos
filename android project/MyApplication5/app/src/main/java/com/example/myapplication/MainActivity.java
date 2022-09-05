package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_name=findViewById(R.id.edit_name);
        final  EditText et_position=findViewById(R.id.edit_position);
        Button btn=findViewById(R.id.btn_submit);

        DAOEmployee dao =new DAOEmployee();
         btn.setOnClickListener(V->{
             Employee emp = new Employee(et_name.getText().toString(), et_position.getText().toString());
                dao.add(emp).addOnSuccessListener(suc-> Toast.makeText(this, "inserted success fully ", Toast.LENGTH_SHORT).show()).addOnFailureListener(er-> Toast.makeText(this, "it is not inserted it has problem", Toast.LENGTH_SHORT).show());
         });
    }
}