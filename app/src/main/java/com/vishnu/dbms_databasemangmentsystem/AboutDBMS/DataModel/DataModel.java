package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class DataModel extends AppCompatActivity {

    TextView data,hierarchical_model,network_model,entity_model,object_model,realtional_model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_model);

        data=findViewById(R.id.data_model_description);
        hierarchical_model=findViewById(R.id.hierarchical);
        network_model=findViewById(R.id.network);
        entity_model=findViewById(R.id.entity);
        object_model=findViewById(R.id.object);
        realtional_model=findViewById(R.id.realtional);

        String description="Database Model define the logical design and sturctre of database and define and updated in database management System" +
                "While resltional model is the most widely use database model and their are also other model are:-<br>" +
                "&#160 &#160 &#160 &#160 <b>1.Hierarchinal Model</b><br>" +
                "&#160 &#160 &#160 &#160 <b>2.Network Model</b><br>" +
                "&#160 &#160 &#160 &#160 <b>3.Entity Realtionship Model</b><br>" +
                "&#160 &#160 &#160 &#160 <b>4.Object Oriented Model</b><br>" +
                "&#160 &#160 &#160 &#160 <b>5.Realtional Model</b><br>" ;

        data.setText(Html.fromHtml(description));
        hierarchical_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DataModel.this,Hierarchical.class);
                startActivity(intent);
            }
        });
        network_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(DataModel.this,Network.class);
                startActivity(intent2);
            }
        });
        entity_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(DataModel.this,EntityRealtionship.class);
                startActivity(intent3);
            }
        });
        object_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(DataModel.this,ObjectOriented.class);
                startActivity(intent4);
            }
        });
        realtional_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(DataModel.this,RealtionalModel.class);
                startActivity(intent5);
            }
        });
    }
}