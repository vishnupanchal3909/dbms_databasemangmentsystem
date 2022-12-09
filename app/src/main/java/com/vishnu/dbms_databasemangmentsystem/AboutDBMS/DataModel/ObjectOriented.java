package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class ObjectOriented extends AppCompatActivity {

    TextView object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_oriented);
        object=findViewById(R.id.object_description);
        String obj="<br>Object oriented model in base upon real word situtation.<br>" +
                "This situtation are represented as object with different attributes.<br>" +
                "all this object have multiple relationship between them element of object oriented data model are:-" +
                "<br><b>1.Object:-</b><br>" +
                "&#160 &#160 &#160 The real word entity and situtation are represented as object in object oriented database model.<br>" +
                "<br><b>2.Attribute And Method:-</b><br>" +
                "&#160 &#160 &#160 Every Object has certain characteristics this are represented using attributes.<br>" +
                "<br><b>3.Class:-</b><br>" +
                "&#160 &#160 &#160 Similar attribute and method are grouped together using a class an object can called an instance of the class.<br>" +
                "<br><b>4.Inheritance:-</b><br>" +
                "&#160 &#160 &#160 A New class  can be derived from the original class.Ther derived class contain attribute and method of original class as well as it own.<br><br>" +
                "<b>Example:-</b><br>" +
                "&#160 &#160 &#160 In this ecample shape,circle,rectangle & triangle are all object in this model.Circle has attribute centre and radius.Rectangle sattribute length,Breadth.Triangle has attribute base and height.The object circle , rectangle , triangle inherit from the object shape.<br><br>";

        object.setText(Html.fromHtml(obj));
    }
}