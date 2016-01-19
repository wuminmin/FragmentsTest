package com.wuminmin.fragmentstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setContentView(R.layout.activity_main);
    }
    public void selectFrag(View view){
        Fragment fragment;
        if(view == findViewById(R.id.button1)){
            fragment = new FragmentOne();
        }else {
            fragment = new BlankFragmentTwo();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place,fragment);
        fragmentTransaction.commit();
    }
}



