package com.example.onecode;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;


    RelativeLayout layoutLogin;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            layoutLogin.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        setContentView(R.layout.login);

        layoutLogin = findViewById(R.id.layoutLogin);

        handler.postDelayed(runnable, 2000);   //the time to load login page

//        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

//        tabs.setupWithViewPager(pager);
    }


}
