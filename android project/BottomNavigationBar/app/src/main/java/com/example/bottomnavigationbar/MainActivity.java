package com.example.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigationbar.ui.Search_Fragment;
import com.example.bottomnavigationbar.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottom_navbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_navbar=findViewById(R.id.bottom_navbar);
        bottom_navbar.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.flnavbar, new Home_Fragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemReselectedListener navListener=new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        //boolean
        public void onNavigationItemReselected(@NonNull MenuItem item) {
            Fragment fragment=null;
            switch (item.getItemId()){
                case R.id.nav_home:
                    fragment=new Home_Fragment();
                    break;
                case R.id.nav_favorite:
                    fragment=new Fovrite_Fragment();
                    break;
                case R.id.nav_search:
                    fragment=new Search_Fragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.flnavbar,fragment).commit();
            //return true;
        }
    };
}