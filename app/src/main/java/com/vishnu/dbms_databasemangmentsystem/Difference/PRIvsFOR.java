package com.vishnu.dbms_databasemangmentsystem.Difference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.vishnu.dbms_databasemangmentsystem.R;

public class PRIvsFOR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privs_for);

        PDFView pdfView=(PDFView) findViewById(R.id.pdf3);
        pdfView.fromAsset("prifor.pdf").load();
    }
}