package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Distinct extends AppCompatActivity {

    TextView distinct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distinct);
        distinct=findViewById(R.id.distinct_description);
        String dis="<br>A Table hood hold duplicate rows in such case to view in update row the <b>Distinct Clause </b>can be use.<br>" +
                "<br>The distinct clause allow removing duplicate from result sale.<br>" +
                "<br>Distinct can be only used with a select statment.<br>" +
                "<b>Syntax:-</b><br>" +
                "&#160 &#160 <b>SELECT DISTINCT col_name1,col_name2,... FROM Tablename;</b><br>" +
                "<br><b>Example:-</b><br>" +
                "&#160 Q.Find out the age group of student.<br><br>" +
                "&#160 &#160 &#160 SELECT DISTINCT age from Student;<br><br>" ;
        distinct.setText(Html.fromHtml(dis));
    }
}