package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Insert extends AppCompatActivity {

    TextView insertd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        insertd=findViewById(R.id.insert_description);

        String in="<br>When inserting single row of data into table. The <b>Inset Operation:-</b><br><br>" +
                "(i).Create new row (empty) in this data table.<br>" +
                "(ii).Load value pass(By Sql Insert) into column specified.<br><br>" +
                "<b>'Insert Into'</b> statement can be use to insert data to Table.<br><br>" +
                "<b><u>Method1:-</u></b><br>" +
                "&#160 &#160Syntax:-<br>" +
                "&#160 &#160 &#160-Insert data into all Column of Table.<br>" +
                "&#160 &#160 &#160INSERT INTO Tablename VALUE (value1,value2,value3,.....);<br><br>"+
                "<b><u>Method2:-</u></b><br>" +
                "&#160 &#160Syntax:-<br>" +
                "&#160 &#160 &#160-Insert data into all Specified column present in the Table.<br>" +
                "&#160 &#160 &#160INSERT INTO Tablename (column1,column2,column3,...) VALUE (value1,value2,value3,.....);<br><br>"+
                "<b><u>Method3:-</u></b><br>" +
                "&#160 &#160Syntax:-<br>" +
                "&#160 &#160 &#160-Acepecting value from User.<br>" +
                "&#160 &#160 &#160INSERT INTO Tablename  VALUE ('&col_name1','&col_name2','&col_name3',..........);<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Write Query to insert data in the Employee Table.<br><br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 &#160 -First we create the Emoployee Table.<br>" +
                "&#160 &#160 &#160 <b>CREATE TABLE </b> Employee (eid  varchar(20), ename varchar(20), department varchar(20));<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 <b>TABLE CREATED</b><br>"+
                "&#160 &#160 &#160 <b>INSERT INTO</b> Employee <b>VALUE</b> ('101','Vishnu Panchal','BCA');<br><br>"+
                "&#160 &#160 &#160 <b>INSERT INTO</b> Employee <b>VALUE</b> ('102','Onkar Nikam','BSC');<br><br>"+
                "&#160 &#160 &#160 <b>INSERT INTO</b> Employee <b>VALUE</b> ('102','Abhay Jagtap','B.Com');<br><br>"+
                "&#160 &#160 &#160 <b>INSERT INTO</b> Employee <b>VALUE</b> ('102','Kartik Panchal','12th');<br><br>"+
                "&#160 &#160 &#160 <b>INSERT INTO</b> Employee <b>VALUE</b> ('103','Umesh Adhari','MCA');<br><br>" +
                "&#160 &#160 &#160 &#160  <b>Value Inserted in The Table.</b><br>";

        insertd.setText(Html.fromHtml(in));
    }
}