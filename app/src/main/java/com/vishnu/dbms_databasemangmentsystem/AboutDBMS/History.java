package com.vishnu.dbms_databasemangmentsystem.AboutDBMS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class History extends AppCompatActivity {

    TextView history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        history=findViewById(R.id.history);
        String his= "&#160 &#160 &#160 &#160 The origin of DBMS can be dated back to 1960s where computers started its dominance in the world. <br>" +
                "&#160 &#160 &#160 &#160 The first DBMS was developed by IBM (known as ‘IMS’) written mainly for the world famous Apollo program.\n<br>" +
                "&#160 &#160 &#160 &#160 Charles Bachman, on the other hand, developed a DBMS called ‘Integrated Database Store’. <br>" +
                "&#160 &#160 &#160 &#160 The systems then were not easy to use and using these precursors in 1970s, Edgar Codd replaced the system with rows & columns where the world is now at present.<br>";
        String hiss="&#160 &#160 &#160 &#160 1960's-1970's: The emergence of the first type of DBMS, the hierarchical DBMS. IBM had the first model, developed on IBM 360 and their (DBMS) was called IMS, originally it was written for the Apollo program. This type of DBMS was based on binary trees, where the shape was like a tree and relations were only limited between parent and child records. The benefits were numerous; less redundant data, data independence, security and integrity, which all lead to efficient searches. Nonetheless; there were some disadvantages such as; complex implementation, was hard to manage because of the absence of standards, which made it harder to handle many relationships.<br>" +
                "<br>" +
                "&#160 &#160 &#160 &#160 1960's-1970's: The emergence of the network DBMS. Charles Bachmann developed first DBMS at Honeywell, Integrated Data Store ( IDS) then a group called CODASYL who is responsible for the creation of COBOL, had that system standardized. However; the CODASYL group invented what they call the \"CODASYL APPROACH. Based on that approach many systems using network DBMS were developed for business use(2). In this model, each record can have multiple parents in comparison with one in the hierarchical DBMS. It is made of sets of relationships where a set represents a one to many relationship between the owner and the member. The main and unfortunate disadvantage was that the System was complex and there was difficulty in design and maintenance, it is believed that the Lack of structural independence was the main cause.<br>" +
                "<br>" +
                "&#160 &#160 &#160 &#160 1970's- 1990's: The emergence of the relational DBMS on the hands of Edgar Codd. He worked at IBM, and he was unhappy with the navigational model of the CODASYL APPROACH. To him, a tool for searching, such as a search facility was very useful, and it was absent . In 1970, he proposed a new approach to database construction, which made the creation of a Relational DBMS intended for Large Shared Data Banks, possible and easy to grab (3). Moreover; This was a new system for entering data and working with big databases, where the idea was to use a table of records. All tables will be then linked by either one to one relationships, one to many, or many to many(2). when elements took space and were not useful, it was easy to remove them from the original table, and all the other \"entries\" in other tables linked to this record were removed. Worth mentioning, is that two initial projects were launched, the R program at IBM, and INGRES program at the university of California. In 1985, the object oriented DBMS was developed, but it did not have any booming commercial profit because of the high unjustified costs to change systems, and format. In 1990, the DBMS took on a new object oriented approach joint with relational DBMS . In this approach, text, multimedia, internet and web use in conjunction with DBMS were available and possible.<br>";


        history.setText(Html.fromHtml(hiss));
    }
}