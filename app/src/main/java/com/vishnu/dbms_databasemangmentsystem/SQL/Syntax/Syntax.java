package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Syntax extends AppCompatActivity {

    TextView insert,update,delete,create,alter,drop,grant,where,distinct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax);

        insert=findViewById(R.id.insert);
        update=findViewById(R.id.update);
        delete=findViewById(R.id.delete);
        create=findViewById(R.id.create);
        alter=findViewById(R.id.alter);
        drop=findViewById(R.id.drop);
        grant=findViewById(R.id.grant);
        where=findViewById(R.id.where);
        distinct=findViewById(R.id.distinct);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Syntax.this,Insert.class);
                startActivity(intent1);
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Syntax.this,Update.class);
                startActivity(intent2);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Syntax.this,Delete.class);
                startActivity(intent3);
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(Syntax.this,Create.class);
                startActivity(intent4);
            }
        });
        alter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(Syntax.this,Alter.class);
                startActivity(intent5);
            }
        });
        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(Syntax.this,Drop.class);
                startActivity(intent6);
            }
        });
        where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7=new Intent(Syntax.this,Where.class);
                startActivity(intent7);
            }
        });
        distinct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8=new Intent(Syntax.this,Distinct.class);
                startActivity(intent8);
            }
        });
        grant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9=new Intent(Syntax.this,Group_by_Having.class);
                startActivity(intent9);
            }
        });

    }
}