package com.vishnu.dbms_databasemangmentsystem.SQL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class IntroOfSQL extends AppCompatActivity {

    TextView intro,hist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_of_sql);
        intro=findViewById(R.id.intro_sql);
        hist=findViewById(R.id.hist_sql);
        String introd="<br><b>SQL (Structured Query Language) </b>is a computer-based structured, formatted database language designed for managing data in relational database managing systems (RDBMS). " +
                "SQL is a standardized computer language which was initially developed by IBM for querying, altering and defining relational databases, using declarative statements.<br><br>" +
                "<br><b>1.SQL is Structured Query Language, which was initially developed by IBM.</b><br>" +
                "<br><b>2.SQL is pronounced as sequel.</b><br>" +
                "<br><b>3.SQL is a computer language for storing, manipulating, and retrieving data in a relational database.</b><br>" +
                "<br><b>4.SQL is the standard language for Relation Database System.</b><br>";

        String history="<br>There are many versions available for SQL. The original version of SQL was developed at IBM's San Jose Research Laboratory (now called Almaden Research Center). This language was initially named as Sequel, in the early 1970s, it was implemented as a part of the R project. The sequel language was evolved since then, and gradually its name has been changed to SQL.<br>" +
                "<br>In 1986, the American National Standard Institute (ANSI) published as SQL standard that was updated again in 1992. The latest ISO standard of SQL was released in 2008 and named as SQL:2008. SQL has established itself as the standard relational database language.<br1>" +
                "<br><br><b>SQL was developed In 1970 by Donald D. Chamberlin and Raymond F. Boyce at IBM.</b><br>" +
                "<br><b>First, the developed version is initially called SEQUEL(Structured English Query Language).</b><br>" +
                "<br><b>Relational software released a first commercial product called System/R in 1979.</b><br>" +
                "<br><b>The SEQUEL acronym was later changed to SQL due to the trademark conflict issue.</b><br>" +
                "<br><b>Later, IBM starts developing commercial products on SQL based on the prototype of System/R.</b><br>";
        intro.setText(Html.fromHtml(introd));
        hist.setText(Html.fromHtml(history));

    }
}