package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.ERDiagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class AttributeAct extends AppCompatActivity {

    TextView attribute,composite,multi,derived;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute);

        attribute=findViewById(R.id.erd_attribute_description);
        composite=findViewById(R.id.erd_composite_attribute_description);
        multi=findViewById(R.id.erd_multivalue_attribute_description);
        derived=findViewById(R.id.erd_derived_attribute_description);

        String attr="<br>An Attribute describe the property.<br>" +
                "Attribute is represented ellipse in ER Diagram.<br><br>" +
                "&#160 &#160 <b>1.Key Attribute:-</b><br>" +
                "&#160 &#160 &#160 -Key attribute can uniquely identify an entity from an entity set.<br>" +
                "&#160 &#160 &#160 -For Example:-<br>" +
                "&#160 &#160 &#160 &#160 &#160 -Student Rool_no can uniquely identify a student from set of student.<br>" +
                "&#160 &#160 &#160 &#160 &#160 -Key Attribute is represented by over same as other attribute.However the text of Key Attribute is underlined.<br>" ;

        String com="&#160 &#160 <b>2.Composite Attribute:-</b><br>" +
                "&#160 &#160 &#160 -An attribute that is combination of other attribute is known an Composite Attribute.<br>" +
                "&#160 &#160 &#160 -For Example:-<br>" +
                "&#160 &#160 &#160 &#160 &#160 -In Student entity,the student address is composite attribute as address of composed of other attribute such as pincode,state,country.<br>";

        String mul="&#160 &#160 <b>3.Multivalued Attribute:-</b><br>" +
                "&#160 &#160 &#160 -An Attribute that can hold the multiple valued is known as multivalued Attribute.<br>" +
                "&#160 &#160 &#160 -It is represented with double line oval in an ER Diagram.<br>" +
                "&#160 &#160 &#160 -For Example:-<br>" +
                "&#160 &#160 &#160 &#160 &#160 -A person can have more than one phone no. so the phone.no attribute is multivalued.<br>";

        String der="&#160 &#160 <b>4.Derived Attribute:-</b><br>" +
                "&#160 &#160 &#160 -Derived attribute is one whose value is dynamic and derived from another attribute.<br>" +
                "&#160 &#160 &#160 -It is represented by dashed oval in ER Diagram.<br>" +
                "&#160 &#160 &#160 -For Example:-<br>" +
                "&#160 &#160 &#160 &#160 &#160 -Person is derived attribute as it changes over time and can be derived from another attribute (date of birth).<br><br>";


        attribute.setText(Html.fromHtml(attr));
        composite.setText(Html.fromHtml(com));
        multi.setText(Html.fromHtml(mul));
        derived.setText(Html.fromHtml(der));
    }
}