package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class ConstriantSQL extends AppCompatActivity {

    TextView constriant,primary,foreign,unique,Default,check,notnull;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constriant_sql);

        constriant=findViewById(R.id.constriant_description);
        primary=findViewById(R.id.primary);
        foreign=findViewById(R.id.foreign);
        unique=findViewById(R.id.unique);
        Default=findViewById(R.id.defaultd);
        check=findViewById(R.id.check);
        notnull=findViewById(R.id.notnull);

        String con="<br>SQL Constriant are rules used to limit the type of data that can go into a table , to maintain the accuracy and integrity of the data inside table.<br><br>" +
                "Constriant eforce to data for type of data that can be inserted or updated or deleted from table.<br><br>" +
                "The whole purpose constriant is to maintain data integrating during an update or delete or insert into table.<br><br>" +
                "<b>Type Of Constriant:-</b> <br>" +
                "<b>1.Primary Key</b><br>" +
                "<b>2.Foreign Key</b><br>" +
                "<b>3.NOT NULL</b><br>" +
                "<b>4.UNIQUE</b><br>" +
                "<b>5.DEFAULT</b><br>" +
                "<b>6.CHECK</b><br>" +
                "";
        constriant.setText(Html.fromHtml(con));
        primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ConstriantSQL.this,Primary.class);
                startActivity(intent1);
            }
        });
        foreign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(ConstriantSQL.this,Foreign.class);
                startActivity(intent2);
            }
        });
        notnull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(ConstriantSQL.this,NotNUll.class);
                startActivity(intent3);
            }
        });
        unique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(ConstriantSQL.this,Unique.class);
                startActivity(intent4);
            }
        });
        Default.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(ConstriantSQL.this,DefaultD.class);
                startActivity(intent5);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(ConstriantSQL.this,Check.class);
                startActivity(intent6);
            }
        });
    }
}