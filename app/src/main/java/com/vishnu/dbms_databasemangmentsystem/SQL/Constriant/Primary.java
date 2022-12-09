package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Primary extends AppCompatActivity {

    TextView primary,feature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);

        primary=findViewById(R.id.primary_description);
        feature=findViewById(R.id.primary_feature);

        String pri="<br><b>A Primary Key</b> is one and more column in table used uniquly identify each row in table.<br>" +
                "A Single column primary key is called as <b>Simple Key.</b><br>" +
                "Multiple Primary key is called <b>Composite Primary Key</b><br>" +
                "When record can't be uniquly identify using value in simple key , composite key must be define.<br>" +
                "Primary Key can be define either <b>Create table statement</b> or an either table statement<br><br>" +
                "<b>Primary Key Constriant Defined At Table Level:-</b><br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 Create Table Stud_info(<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 rno varchar(5) Primary Key,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 name varchar(5),<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 contact_no number(10,0));</b><br><br> " ;

        String fea="<br><b>1.Primary key will not allow duplicate value<br>" +
                "2.Primary key cannot br long or long row<br>" +
                "3.Only one primary key is allow for table<br>" +
                "4.One table can combine up to is column in composite primary key<br></b>";

        primary.setText(Html.fromHtml(pri));
        feature.setText(Html.fromHtml(fea));
    }
}