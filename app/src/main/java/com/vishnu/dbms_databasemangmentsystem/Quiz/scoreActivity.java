package com.vishnu.dbms_databasemangmentsystem.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class scoreActivity extends AppCompatActivity {

    TextView scc;
    String sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scc=findViewById(R.id.score);

        sc=getIntent().getStringExtra("SCORE");
        scc.setText(sc);
        
    }
}