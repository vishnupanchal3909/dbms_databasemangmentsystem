package com.vishnu.dbms_databasemangmentsystem.AboutDBMS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Feature extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);
        textView=findViewById(R.id.textfeature);
        String fea = "Following are the features of a database management system:\n<br>" +
                "\n" +
                "<br><b>1. Minimum repetition and redundancy:</b><br>" +
                " In a database there are high chances of data duplication due to the presence of many users. DBMS resolves this issue by building a repository where all the data are stored and can be accessed by multiple users.\n" +
                "\n" +
                "<br><br><b>2. Databases of big corporations or companies can only be managed by a database management system. Database management system offers data protection and features like recovery and backup for easy recording and retrieval of data.\n</b><br>" +
                "\n" +
                "<br><br><b>3. Enhanced security: </b><br>" +
                "Database management systems offer enhanced security by restricting public access. It can only be accessed by a database administrator or the concerned head of the department.\n" +
                "\n" +
                "<br><br><b>4. Multiple user access:</b><br>" +
                " Database is designed in such a way that it can be accessed by multiple users who can work on different sections of the databases at a time without interrupting the flow of work.\n" +
                "\n" +
                "<br><br><b>5. Provides multiple views of the data:</b><br>" +
                " Database management system allows the users to access multiple views of the data present in the database. For e.g an HR personnel can check the database for processing the data of the employee, while at the same time an employee can use the database to access resources related to payslip, attendance, etc.\n" +
                "\n" +
                "<br><br><b>6. Permanent storage of data:</b><br>" +
                " Data stored in a database will remain stored permanently until and unless it is deleted from the system manually. Even in cases of accidental deletion of data, the database system has a robust recovery system which allows recovery of deleted data.";
        textView.setText(Html.fromHtml(fea));
    }
}