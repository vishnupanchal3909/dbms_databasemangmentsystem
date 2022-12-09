package com.vishnu.dbms_databasemangmentsystem.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class QuizActivity extends AppCompatActivity {

    TextView start;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        start=findViewById(R.id.startquiz);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizActivity.this,LevelActivity.class);
                startActivity(intent);
            }
        });
    }
}