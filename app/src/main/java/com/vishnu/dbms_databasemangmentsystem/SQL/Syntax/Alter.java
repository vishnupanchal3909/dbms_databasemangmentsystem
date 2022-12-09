package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Alter extends AppCompatActivity {

    TextView alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter);

        alert=findViewById(R.id.alter_description);

        String ale="<br>The Structure of a table can be modifying by using Alter Table Command.<br>" +
                "<br>With alter table command it is possible to add or delete the column or change the data type of existing column.<br>" +
                "<br>The alter table works by making the tempary copy of original table.<br>" +
                "<br>The altertion perfrom on the copy then original table is deleted & the new once is renamed.<br>" +
                "<br><b>Syntax:-</b><br>" +
                "&#160 &#160 &#160 <b>Alter Table</b> tablename <b>Add</b>(col_name1 datatype,col_name2  datatype,..);<br>" +
                "<br><b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Add Column City and Doj in the table employee.<br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 Alter Table employee Add(City varchar(20),Doj Date);<br>" ;
        alert.setText(Html.fromHtml(ale));
    }
}