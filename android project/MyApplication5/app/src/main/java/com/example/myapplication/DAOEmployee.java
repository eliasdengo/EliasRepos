package com.example.myapplication;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class DAOEmployee {
    private final DatabaseReference databaseReference;
    DAOEmployee(){
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        databaseReference=db.getReference(Employee.class.getSimpleName());

    }

    public Task<Void> add(Employee emp)
    {
        return databaseReference.push().setValue(emp);
    }


}
