package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

  class MainActivity : AppCompatActivity() {

      override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       EditText et_name=findViewById(R.id.edit_name)
       final  EditText et_position=findViewById(R.id.edit_position)
        Button btn=findViewById(R.id.btn_submit)

          DAOEmployee dao=new DAOEmployee();
            btn.SetOnClickListener(V->run {
              Employee emp = new Employee(et_name.getText().toString(), et_position.getText().toString())
          });

          HashMap<String,Objects> hashmap=new HashMap<>();
          hashmap.put("name",et_name.getText().toString());
          hashmap.put("position",et_position.getText().toString());
          dao.update(key:"",hashmap);

          dao.remove(key:"");
    }
}