package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class RelationAct extends AppCompatActivity {

    TextView relationship,Onem,ManyO,ManyM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relation);

        relationship=findViewById(R.id.erd_relationship_description);
        Onem=findViewById(R.id.erd_1_TO_M_description);
        ManyO=findViewById(R.id.erd_M_TO_1_description);
        ManyM=findViewById(R.id.erd_M_TO_M_description);

        String Rel="<br>&#160 &#160 -It is association between different entity.<br>" +
                "&#160 &#160 -A relationship is represented by the diamond ship with ER Diagram.<br>" +
                "&#160 &#160 -It SHow the relationship Among entity.<br>" +
                "&#160 &#160 -Ther are Four type of Relationship:-<br>" +
                "<b>1.One To One [1:1]:-</b><br>" +
                "&#160 &#160 -When single instance of an entity is associated single instance of another entity then it's called One To One Relationship.<br>" ;

        String Om="<b>2.One To Many [1:M]:-</b><br>" +
                "&#160 &#160 -When single instance of an entity is associated with more than one instance of another entity then it is called One To Many Relationship.<br>" +
                "&#160 &#160 -For Example:-<br>" ;

        String Many="<b>3.Many To One [M:1]:-</b><br>" +
                "&#160 &#160 - More than one instance of an entity is associated with single instance of another entity then it is called Many To One Relationship.<br>" +
                "&#160 &#160 -For Example:-";

        String ManyMm="<b>4.Many To Many [M:M]:-</b><br>" +
                "&#160 &#160 -When more than one instance of entity is associated with more than one instance then it is called Many To Many Relationship.<br>" +
                "&#160 &#160 -For Example:-";

        ManyM.setText(Html.fromHtml(ManyMm));
        Onem.setText(Html.fromHtml(Om));
        ManyO.setText(Html.fromHtml(Many));
        relationship.setText(Html.fromHtml(Rel));
    }
}