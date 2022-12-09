package com.vishnu.dbms_databasemangmentsystem.SQL.Constriant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

import org.w3c.dom.Text;

public class NotNUll extends AppCompatActivity {

    TextView nnull;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_null);

        nnull=findViewById(R.id.notnull_description);

        String notn="<br>NOT NULL Constriant make sure that a column does not hold null value.<br><br>" +
                "When we don't provide value for particular column while inserting record into table , it takes null value by default.<br><br>" +
                "By specifing NOT NULL content , we can be sure that particular column connot have not null.<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 CREATE TABLE Student(<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 Roll_no varchar(5) Primary key,<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 name varchar(5) NOT NULL,<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 age integer NOT NULL,<br>" +
                "&#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 &#160 address varchar(20)  );<br>";

        nnull.setText(Html.fromHtml(notn));
    }
}