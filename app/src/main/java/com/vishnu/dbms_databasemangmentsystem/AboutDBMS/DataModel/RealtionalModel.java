package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class RealtionalModel extends AppCompatActivity {

    TextView relation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtional_model);
        relation=findViewById(R.id.relational_description);
        String rela="The relational model represent the database as a collection of <b>relations.</b> relation is nothing but a table of values.Every row in the table represent a collection of related data values.These rows in the table denote a real-world entity or relationship.<br>" +
                "<br>In this model data is organised in 2D table and relationahip maintain by storing a common field.<br><br>" +
                "This model introduce E.F. codd in 1970 ans Sinces then it has been the most widely use database model , infact , We can say only Database model use around word.<br><br>" +
                "this basic structure of Data in relational model is stable all the information related to particular type is stored in row of that table .<br><br>" +
                "Hence table also know as the relation in relational model<br><br>" +
                "<b>Some popular Relational Database Management System are:-</b><br><br>" +
                "&#160 &#160 &#160 &#160 DB2 and Informix Dynamic Server-IBM<br>" +
                "&#160 &#160 &#160 &#160 Oracle and RDB -Oracle<br>" +
                "&#160 &#160 &#160 &#160 SQL Server and Access-Microsoft<br><br>" +
                "<b>Relational Model Concepts:-</b><br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 Attribute,Table,Tuple,Relation Schema,Degree,Cardinality,Column,Relation Instance,Relation Key,Attribute Domain<br><br>"+
                "<b>Example:-</b><br><br>";
        relation.setText(Html.fromHtml(rela));
    }
}