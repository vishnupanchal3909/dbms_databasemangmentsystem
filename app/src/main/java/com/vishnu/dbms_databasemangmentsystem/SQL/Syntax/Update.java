package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Update extends AppCompatActivity {

    TextView update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        update=findViewById(R.id.Update_description);

        String up="<br>It statement is used to update the column in existing row of table with new value.<br><br>" +
                "The <b>SET</b> clause indicate which column data should be modified and new values they should hold.<br><br>" +
                "<b>Where</b>clause if given , specified which rows should be updated and it is not specified then all row in table are updated.<br><br>" +
                "<b>Syntax:-</b><br>" +
                "<br><b>UPDATE</b> Tablename <b>SET</b> col_name1=value1 , col_name2=value2 , col_name3=value3 [WHERE Condition] ;<br><br>" +
                "<b><u>Example:-</u></b><br>" +
                "&#160 &#160 Q.Update the salalry of employee to 20,000 to whoose salary 15000.<br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 <b>UPDATE</b> Employee <b>SET</b> salary=20,000 WHERE salary=15,000 ;";

        update.setText(Html.fromHtml(up));
    }
}