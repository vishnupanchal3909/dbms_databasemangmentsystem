package com.vishnu.dbms_databasemangmentsystem.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class LevelActivity extends AppCompatActivity {

    TextView low,medium,high;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        low=findViewById(R.id.low);
        medium=findViewById(R.id.medium);
        high=findViewById(R.id.hard);

        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),QuestionActivity.class);
                intent1.putExtra("Low","Categorie");
                startActivity(intent1);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(getApplicationContext(),Supplier.class);
                intent2.putExtra("Medium","Supplier");
                startActivity(intent2);
            }
        });
        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(getApplicationContext(),Danger.class);
                intent3.putExtra("Hard","Danger");
                startActivity(intent3);
            }
        });

    }
}