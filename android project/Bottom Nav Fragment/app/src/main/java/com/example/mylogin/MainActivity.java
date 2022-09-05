package com.example.mylogin;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mylogin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
      binding.btnview.setOnItemReselectedListener(item -> {
         switch (item.getItemId()){

             case R.id.home:
                 replaceFragment(new HomeFragment());
                 break;
             case R.id.profile:
                 replaceFragment(new ProfileFragment());
                 break;
             case R.id.setting:
                 replaceFragment(new SettingFragment());
                 break;
         }


      });
    }
    public void replaceFragment(Fragment fragment){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
    }
}