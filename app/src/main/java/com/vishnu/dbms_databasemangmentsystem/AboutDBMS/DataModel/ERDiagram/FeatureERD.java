package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class FeatureERD extends AppCompatActivity {

    TextView Generalixation,specialization,aggrgation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_erd);

        Generalixation=findViewById(R.id.erd_generalization_description);
        specialization=findViewById(R.id.erd_generalization2_description);
        aggrgation=findViewById(R.id.erd_special_description);

        String General="<br><b>1.Generalization:-</b><br>" +
                "&#160 &#160 -Is the process in which common attribute of more than one entity from new entity.<br>" +
                "&#160 &#160 -This newely from entity is called Generalized Entity.<br>" +
                "&#160 &#160 -Generalization is bottom of Process:-<br>" +
                "&#160 &#160 &#160 -If we have two entity student and teacher, the attribute of entity  student are name,address, and greade.<br>" +
                "&#160 &#160 &#160 -Attribute teacher entity are name,address and salary.<br>" +
                "&#160 &#160 &#160 -The ER Diagram Before Generalization looks like this.<br><br>";

        String special="&#160 &#160 &#160 -We have created new generalized entity person and this entity has common attribute of both the entity.<br>" +
                "&#160 &#160 &#160 -After the generalization process the entoty student and teacher only has the specalised attribute grade and salary resp. and their common attribute name and address are now associated with a new entity person which is in relationship with both entity i.e. student and teacher/.<br><br>" +
                "<br><b>2.Specialization:-</b><br>" +
                "&#160 &#160 -Specialization is process in which an entity is divided subentity.<br>" +
                "&#160 &#160 -It is reverse process of generalization in generalization two entity combine together to from new higher level entity.<br>" +
                "&#160 &#160 -Specialization is <b>Top Down Process</b><br>" +
                "&#160 &#160 -The idea behind the specialization is to find out the subset of entity that have few distinction attribute.<br>" +
                "&#160 &#160 -Consider employee entity which can be further classified as subentity techination , enginer and accountant because, this subentity have some distinguation attribute.<br>";

        String Aggrg="&#160 &#160 -In above diagram we can say that we have higher level entity employee which divided into subentity techination , engineer , accountant.<br>" +
                "&#160 &#160 -All this are just an employee of company but their roll is completely different and they have few different attribute.<br>" +
                "<b>For Example:-</b><br>" +
                "&#160 &#160 -Techination handle serivce request engineer work on project and accountant handle creadit and debit details.<br>" +
                "&#160 &#160 - all this three employee type have few attribute , common such as name and salary which are associated with parent entity employee as shown in the abhove diagram.<br>" +
                "<br>" +
                "<br><b>3.Aggrgation:-</b><br>" +
                "&#160 &#160 - Is process in which single entity alone is not able to make since the relationship so the relationship of two entity acts as ine entity.<br>" +
                "&#160 &#160 -Example:-<br>" +
                "&#160 &#160 &#160 -In real word we known that the manager not only manager the employee working under them.<br>" +
                "&#160 &#160 &#160 -But we have to manage the project as well in such senior if entity manager make man relationship.<br>" +
                "&#160 &#160 &#160 -manager relationship either employee or project entity alone then it will not make any sense madam has to manager both.<br>" +
                "&#160 &#160 &#160 -In this case relationship of two entity at as one entity in above example the relationship work on between employee project acts as one entity that  has relationship manager with entity manager.<br>";

        Generalixation.setText(Html.fromHtml(General));
        specialization.setText(Html.fromHtml(special));
        aggrgation.setText(Html.fromHtml(Aggrg));
    }

}