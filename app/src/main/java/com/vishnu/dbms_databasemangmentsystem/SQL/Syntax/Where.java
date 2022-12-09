package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Where extends AppCompatActivity {

    TextView where;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where);

        where=findViewById(R.id.where_description);
        String whe="<br>It Use along with select statment to retrive record from table based on specific condition.<br><br>" +
                "<b>Syntax:-</b><br><br>" +
                "&#160 &#160 SELECT * FROM Tablename <b>WHERE</b> condition;<br>" +
                "<br><b>Example:-</b><br><br>"+
                "&#160 &#160 Q.Display List Of Student Whoose Age is less than 20.<br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 &#160 SELECT * FROM Student WHERE age < 20 ;";
        where.setText(Html.fromHtml(whe));
    }
}