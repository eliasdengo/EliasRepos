package com.example.myapplication;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOEmployee {
    private DatabaseReference databaseReference;
    DAOEmployee(){
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        databaseReference=db.getReference(Employee.class.getSimpleName());

    }

    public Task<Void> add(Employee emp)
    {
          return databaseReference.push().setValue(emp);
    }
    public Task<Void> update(String Key,HashMap<String,Object> hashmap){

        return databaseReference.child(key).updateChildren(hashmap);
    }

    public Task<Void> remove(String key){
        return databaseReference.child(key).removeValue();
    }
}
