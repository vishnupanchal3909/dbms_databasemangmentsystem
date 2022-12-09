package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram.AttributeAct;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram.EntityAct;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram.FeatureERD;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram.RelationAct;
import com.vishnu.dbms_databasemangmentsystem.R;

public class EntityRealtionship extends AppCompatActivity {

    TextView entity,erd,EntityER,AttributeER,RelationER,Feature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entity_realtionship);

        entity=findViewById(R.id.entity_description);
        erd=findViewById(R.id.ER);
        EntityER=findViewById(R.id.EntityER);
        AttributeER=findViewById(R.id.AttributeER);
        RelationER=findViewById(R.id.RelationER);
        Feature=findViewById(R.id.ErdFeature);

        String ent="<br>&#160 &#160 &#160 &#160 It is model in which we see real word object(Entities)and relationship between them.<br><br>" +
                "&#160 &#160 &#160 &#160 In This Database model,relationship are created by dividing object into entity and it charteristic into attribute.<br><br>" +
                "&#160 &#160 &#160 &#160 Differenet entity are related using relationship.<br><br>" +
                "&#160 &#160 &#160 &#160 This Model is good to design database which can then we turn into tables in relational model.<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 &#160 &#160 Their are two entities student and college and their relationship student entity has attribute such as stu.Id,stu.Name, and stud.add and college entity has attribute such as coll.Id,coll.name <br><br>" +
                "&#160 &#160 &#160 &#160 It Is ER Diagram show Object,Place People within that system.It is data model tenchinque which help in defining the Business Process.<br><br>" ;

        String er="<br><b>Component Of ER Diagram:-</b><br>" +
                "&#160 &#160 <br>1.Entity:-<br>" +
                "&#160 &#160 &#160 &#160 Weak Entity" +
                "&#160 &#160 <br>2.Attribute:-<br>" +
                "&#160 &#160 &#160 &#160 Key,Composite,Multivalued,Derived<br>"+
                "&#160 &#160 <br>3.Relationship:-<br>" +
                "&#160 &#160 &#160 &#160 One To One[1:1],One To Many[1:M],Many To One [M:1],Mant To Many[M:M] <br>";

        entity.setText(Html.fromHtml(ent));
        erd.setText(Html.fromHtml(er));

        EntityER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(EntityRealtionship.this, EntityAct.class);
                startActivity(intent1);
            }
        });
        AttributeER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(EntityRealtionship.this, AttributeAct.class);
                startActivity(intent2);
            }
        });
        RelationER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(EntityRealtionship.this, RelationAct.class);
                startActivity(intent3);
            }
        });
        Feature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(EntityRealtionship.this, FeatureERD.class);
                startActivity(intent4);
            }
        });
    }
}