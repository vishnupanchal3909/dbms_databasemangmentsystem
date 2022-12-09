package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Foreign extends AppCompatActivity {

    TextView foreign,feature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreign);
        foreign=findViewById(R.id.foreign_description);
        feature=findViewById(R.id.foreign_feature);

        String fore="<br><b>Foreign</b> Key represent relationship between table.<br>" +
                "<br>Foreign key is column (all group of column) whose values are derived from the primary key or unique key of some other table.<br>" +
                "<br>The table in which foreign is defined is called <b>Foreign Table</b> or <b>Details Table</b> <br>" +
                "<br>The Table that defines a primary key and he's reference by the foreign key is called <b>Primary Key</b> or <b>Master</b><br>" +
                "<br>Foreign Key can be define either in <b>CREATE TABLE </b> statement or <b>Alter Table</b> statement<br>" ;
        String featy="<br>1.<b>Foreign</b> Key Constraint can be specification child table but not parent table.<br>" +
                "2.Parent record can be deleted provided no child  record exits<br>" +
                "3.Master table cannot be updated if child record exist.<br>" +
                "<br><b>Important Points:-</b><br>" +
                "<br>1.Record cannot be inserted into in details table in corresponding record in master table doesnot exist.<br>" +
                "<br>2.Record of master table cannot be deleted if corresponding record in the details table actually exist.<br>" +
                "<br><br><b>EXAMPLE:-</b><br>"+
                "<br>&#160 &#160 &#160 &#160 &#160 &#160 Create Table student(<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 rno varchar(5) Primary Key,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 name varchar(5),<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 city varchar(30) );</b><br><br> " +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 <b>TABLE CREATED...</b><br>" +
                "<br>&#160 &#160 &#160 &#160 &#160 &#160 Create Table Smark(<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 rno varchar(5) <b>reference</b> student,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 sub1 number(3,2),<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 sub2 number(3,2),<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 sub3 number(3,2),<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 sub4 number(3,2) );<br><br>" ;


        foreign.setText(Html.fromHtml(fore));
        feature.setText(Html.fromHtml(featy));

    }
}