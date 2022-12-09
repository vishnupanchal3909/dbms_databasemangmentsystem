package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Create extends AppCompatActivity {

    TextView create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        create=findViewById(R.id.create_description);

        String cre="<br>Name can have maximun upto 30 char acter.A name should be begin with alphbeat .<br>" +
                "Alphbeat from A to Z and a to z and Number 0 to 9 are allowd.<br>" +
                "The Use of special character under store('_') is allowd and also recommded.<br>" +
                "SQL Reciver word are not allowd.<br><br>" +
                "<b>Syntax:-</b><br>" +
                "<b>CREATE TABLE </b> tablename (col_name1 DataType,col_name2 DataType,col_name3 DataType........,col_nameN DataType);<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Create Table Employee with employee Id,employee name,employee department,employee salary.<br><br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 &#160 -First we create the Emoployee Table.<br>" +
                "&#160 &#160 &#160 <b>CREATE TABLE </b> Employee (eid  varchar(20), ename varchar(20), department varchar(20),salary varchr(20));<br>" ;


                create.setText(Html.fromHtml(cre));
    }
}