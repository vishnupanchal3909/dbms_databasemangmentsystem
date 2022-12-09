package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Hierarchical extends AppCompatActivity {

    TextView hierarchical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hierarchical);
        hierarchical=findViewById(R.id.hierarchical_description);
        String des="<br>&#160 &#160 &#160 This database model organises data into a tree life structure with single loop to which all other data is link.<br><br>" +
                "&#160 &#160 &#160 The Hierarchicak key start from the group data and expands like tree adding child nodes to the parent node.<br><br>" +
                "&#160 &#160 &#160 The Hierarchical base on parent child relationship.<br><br>" +
                "&#160 &#160 &#160 In this model a child node will only have single parent node.<br><br>" +
                "&#160 &#160 &#160 In this Example given above one department can have many course many teachers and students.<br><br>";
        hierarchical.setText(Html.fromHtml(des));
    }
}