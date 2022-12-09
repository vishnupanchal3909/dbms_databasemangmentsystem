package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Unique extends AppCompatActivity {

    TextView uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unique);
        uni=findViewById(R.id.unique_description);
        String uniq="<br><b>Unique</b> Constriant ensure that all values in column are different.<br>" +
                "<br>If column has unique constriant it means that particular column cannot have duplicae value in your table.<br>" +
                "<br>Both the unique and primary key constriant provide quarranty for uniquness For Column or set of column expect unique allows null value.<br>" +
                "<br>Primary key constraint automatically has (Unique Not Null) constraint.<br>" +
                "<br>However you can have many unique constraint per table but only one primary key constraint per table<br>" +
                "<br><b>Example:-</b><br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 Create Table Person(<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 Pid varchar(5) Not Null Unique,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 Lastname varchar(5) Not Null,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 firstname varchar(5) ,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 age varchar(5) check(age>=18),<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 contact_no Integer Unique);</b><br><br> " +
                "<br>In this example Pid cannot be blank and also cannot have duplicate value.<br>" ;

        uni.setText(Html.fromHtml(uniq));
    }
}