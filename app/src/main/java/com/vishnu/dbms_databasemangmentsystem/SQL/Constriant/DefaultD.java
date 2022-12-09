package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class DefaultD extends AppCompatActivity {

    TextView def;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_d);

        def=findViewById(R.id.defalut_description);

        String defalut="<br><b>The Default constent provide the default value to column when there is no value provided while inserting record into table.</b><br><br>" +
                "<b>Example:-</b><br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 CREATE TABLE Student(<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 Roll_no varchar(5) Primary key,<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 name varchar(5) NOT NULL,<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 age integer NOT NULL,<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 address varchar(20) ,<br> " +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 examfee number(6,2) Default 1000);";

        def.setText(Html.fromHtml(defalut));
    }
}