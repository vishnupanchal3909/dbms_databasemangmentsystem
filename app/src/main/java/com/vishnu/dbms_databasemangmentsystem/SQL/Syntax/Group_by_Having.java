package com.vishnu.dbms_databasemangmentsystem.SQL.Syntax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Group_by_Having extends AppCompatActivity {

    TextView group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_by_having);
        group=findViewById(R.id.group_description);
        String gro="<br><b>'Group By' and 'Having' Clause</b><br>" +
                "<br>The <b>GROUP BY</b> is use to group rows with same values.<br>" +
                "<br>The Group by cluase is use together with the sql select statment.<br>" +
                "<br>The select statment use in group by cluase can only be use which contain column name,aggrgate function , contant and expression.<br>" +
                "<br>The having cluase is use to restrict the result written by 'Group By' cluase.<br>" +
                "<br><b>Syntax:-</b><br><br>" +
                "&#160 &#160 SELECT stmt.... <b>GROUP BY</b> col_name1,col_name2,....<b>[HAVING CONDITION]</b><br><br>;" +
                "<b>Example:-</b><br>" +
                "&#160 &#160 Q.Find Maximun salalry of each department.<br>" +
                "<b>Answer:-</b><br>" +
                "&#160 &#160 &#160SELECT dept,Max(salary) FROM Employee <b>GROUP BY</b> dept;<br><br>";
        //https://www.tutorialcup.com/dbms/datatypes-variables.htm#:~:text=There%20are%20four%20types%20of%20Scalar%20datatypes%20%E2%80%93,fixed%20%20...%20%2017%20more%20rows%20
        group.setText(Html.fromHtml(gro));
    }
}