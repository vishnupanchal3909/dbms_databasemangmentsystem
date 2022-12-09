package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Delete extends AppCompatActivity {

    TextView delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        delete=findViewById(R.id.delete_description);

        String del="<br>The <b>DELETE</b> statment in SQL is used delete existing records from a table. We can delelte a single record or multiple records depending on the condition we specify in the WHERE clause.<br><br>" +
                "The delete command delete record from the table that satifies the condition provided by its where clause & written the no.of records deleted.<br><br>" +
                "The delete statment without where clause use all the record will be deleted.<br> " +
                "<b>Syntax:-</b><br>" +
                "<br><b>DELETE FROM </b> tablename <b>WHERE</b> condition ;<br>" +
                "<b>tablename:</b> name of the table.<br>" +
                "<b>condition:</b> condition to choose particular record.<br>"+
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Delete All Record Of Table Employee.<br><br>" +
                "<b>Answer:-</b><br>" +
                "<b>DELETE</b> from Employee;<br><br>" ;

        delete.setText(Html.fromHtml(del));
    }
}