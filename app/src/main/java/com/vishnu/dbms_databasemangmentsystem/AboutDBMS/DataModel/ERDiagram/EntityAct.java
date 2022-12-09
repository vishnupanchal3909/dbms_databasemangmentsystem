package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class EntityAct extends AppCompatActivity {

    TextView er_entity,er2_entity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entity);

        er_entity=findViewById(R.id.erd_entity_description);
        er2_entity=findViewById(R.id.erd2_entity_description);


        String erd="<br>It is thing in real word with it's old existance.<br><br>" +
                "<b>Example:-</b><br><br>" +
                "car,man,house,company<br><br>" +
                "<br>Entity is represented as rectangle in an ER Diagram.<br><br>" +
                "<br><br>" +
                "<b>Weak Entity:-</b><br><br>" +
                "&#160 &#160 -Weak Entity is even that depend on it owner entity.i.e. strong entity for it's existance.<br><br>" +
                "&#160 &#160 -Weak Entity is denoted by doubble rectangle.<br><br>" +
                "&#160 &#160 -Example:-<br>" +
                "&#160 &#160 A customer broww loan here we have two entity 1st customer entity and 2nd loan entity.<br><br>";

        String red2="<br>&#160 &#160 -For each loan their should be atleast one borrow other wise that loan couldn't leasted in loan entity set.<br>" +
                "&#160 &#160 -But even if a customer doesn't any loan leasted in customer entity.<br>" +
                "&#160 &#160 -It means that customer entity doesn't depend on loan entity.<br>" +
                "&#160 &#160 -relationship between once from and weak entity is represented by doubble diamond sign and line connected between them it also doubble line.<br>";
        er_entity.setText(Html.fromHtml(erd));
        er2_entity.setText(Html.fromHtml(red2));

    }
}