package com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Network extends AppCompatActivity {

    TextView network;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        network=findViewById(R.id.network_description);
        String net="<br>&#160 &#160 &#160 &#160 This an extincation for hierarchical model in this model data is organised more like graph and allow to have more than one parent node.<br><br>" +
                "&#160 &#160 &#160 &#160 In this Database model data is more realted and more relationship are established in this database Model.<br><br>" +
                "&#160 &#160 &#160 &#160 As the Data more related.Hence accesng data is also easier and fast.<br><br>" +
                "&#160 &#160 &#160 &#160 This database model was use to map many to many data relationship.<br><br>" +
                "&#160 &#160 &#160 &#160 Main difference of network model from the hierarchical model is abihity with other word it allow record to have more than one parent.<br><br>";
        network.setText(Html.fromHtml(net));
    }
}