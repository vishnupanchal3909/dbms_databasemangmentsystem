package com.vishnu.dbms_databasemangmentsystem.Difference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.vishnu.dbms_databasemangmentsystem.R;

public class SQLvsNOSQL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlvs_nosql);
        PDFView pdfView=(PDFView) findViewById(R.id.pdf2);
        pdfView.fromAsset("nosql.pdf").load();
    }
}