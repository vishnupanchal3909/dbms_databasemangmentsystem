package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Drop extends AppCompatActivity {

    TextView sort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop);
        sort=findViewById(R.id.sort_description);
        String sor="<br><b>Syntax:-</b><br>" +
                "<br>SELECT * FROM Tablename <b>ORDER BY</b> col_name1,col_name2,... [sort order]<br>" +
                "<br>The Order By Clause corts the record based on column specified.<br>" +
                "<br>When sort order is not specified record are sorted in acsending order<br><br>" +
                "The sort the record in descending order.We have to use for Sort order <b>desc</b><br>" +
                "<br><b>Example:-</b><br><br>" +
                "&#160 &#160 Q1.Sort record name vise for table employee.<br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 SELECT * FROM Employee ORDER BY eno,ename;<br><br>"+
                "&#160 &#160 Q2.Display record of Employee name vise in Descending order.<br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 SELECT * FROM Employee ORDER BY ename desc;<br>";
        sort.setText(Html.fromHtml(sor));
    }
}