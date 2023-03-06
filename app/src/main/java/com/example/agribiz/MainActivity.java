package com.example.agribiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Animation animation_top, animation_bottom;
    TextView logo;
    Button login_btn, signup_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }
        animation_top = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        animation_bottom = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo = findViewById(R.id.logo);
        login_btn = findViewById(R.id.login);
        signup_btn = findViewById(R.id.sign_up);


        logo.setAnimation(animation_top);
        login_btn.setAnimation(animation_bottom);
        signup_btn.setAnimation(animation_bottom);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finishAffinity();
            }
        });

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent1);
                finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed(){
        finish();
        System.exit(0);
    }
}