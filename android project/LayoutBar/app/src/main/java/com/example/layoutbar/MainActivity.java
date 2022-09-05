package com.example.layoutbar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout dr=findViewById(R.id.drawerlayout);
        findViewById(R.id.menu).setOnClickListener(view -> dr.openDrawer(GravityCompat.START));
        NavigationView nav=findViewById(R.id.navigation);
        nav.setItemIconTintList(null);
    }
}