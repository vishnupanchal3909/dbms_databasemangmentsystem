package com.vishnu.dbms_databasemangmentsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnu.dbms_databasemangmentsystem.Quiz.QuizActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv,tv2;
    Animation animation,animation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.pink);
        tv2=findViewById(R.id.pinky);
        animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        animation2=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        tv.setAnimation(animation);
        tv2.setAnimation(animation2);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Another_Main.class);
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Another_Main.class);
                startActivity(intent);
            }
        });
    }

}