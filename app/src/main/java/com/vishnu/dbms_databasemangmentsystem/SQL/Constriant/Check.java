package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Check extends AppCompatActivity {

    TextView check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        check=findViewById(R.id.check_description);
        String chec="<br>The <b>CHECK</b> Constraint is use to limit the value range that can be place in the column.<br>" +
                "<br>If you define check constraint on single column it allows only certain values for this column.<br><br>" +
                "<b>Example:-</b><br>" +
                "&#160 &#160 &#160 &#160 The Age is greater than 18<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 Create Table Person(<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 Pid varchar(5) Not Null Unique,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 Lastname varchar(5) Not Null,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 firstname varchar(5) ,<br>" +
                "&#160 &#160 &#160&#160 &#160 &#160 &#160&#160 &#160 &#160 &#160 &#160 age varchar(5) check(age>=18) );<br>" +
                "<b>In this xample check constraint ensure that you cannot have any person below 18 years.</b><br>" ;

                check.setText(Html.fromHtml(chec));
    }
}