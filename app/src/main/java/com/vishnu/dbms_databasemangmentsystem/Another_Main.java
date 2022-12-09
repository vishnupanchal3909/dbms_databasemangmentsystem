package com.vishnu.dbms_databasemangmentsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.Advantage;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.DataModel.DataModel;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.Feature;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.History;
import com.vishnu.dbms_databasemangmentsystem.AboutDBMS.IntroDBMS;
import com.vishnu.dbms_databasemangmentsystem.Difference.DBMSvsRDBMS;
import com.vishnu.dbms_databasemangmentsystem.Difference.PRIvsFOR;
import com.vishnu.dbms_databasemangmentsystem.Difference.SQLvsNOSQL;
import com.vishnu.dbms_databasemangmentsystem.Quiz.QuestionActivity;
import com.vishnu.dbms_databasemangmentsystem.Quiz.QuizActivity;
import com.vishnu.dbms_databasemangmentsystem.SQL.Constriant.ConstriantSQL;
import com.vishnu.dbms_databasemangmentsystem.SQL.IntroOfSQL;
import com.vishnu.dbms_databasemangmentsystem.SQL.Operator;
import com.vishnu.dbms_databasemangmentsystem.SQL.Syntax.Syntax;

public class Another_Main extends AppCompatActivity {

    TextView introDBMS,addis_DBMS,feature_DBMS,histoey_DBMS,dataModel_DBMS,intro_SQL,DBMS_RDBMS,
            SQL_NOSQL,PRI_FOR,Constriant_sql,Operator_SQL,syntax_SQL;
    private static final int TIME_DELAY = 2000;
    private static long back_pressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_main);

        introDBMS=findViewById(R.id.intro_of_dbms);
        addis_DBMS=findViewById(R.id.advantage_of_dbms);
        feature_DBMS=findViewById(R.id.feature_of_dbms);
        histoey_DBMS=findViewById(R.id.history_of_dbms);
        dataModel_DBMS=findViewById(R.id.data_model);
        intro_SQL=findViewById(R.id.intro_of_sql);
        DBMS_RDBMS=findViewById(R.id.dbms_vs_rdbms);
        SQL_NOSQL=findViewById(R.id.sql_vs_nosql);
        PRI_FOR=findViewById(R.id.pri_vs_for);
        Constriant_sql=findViewById(R.id.constraint_of_dbms);
        Operator_SQL=findViewById(R.id.operator);
        syntax_SQL=findViewById(R.id.syntax);


        introDBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Another_Main.this, IntroDBMS.class);
                startActivity(intent1);
            }
        });
        addis_DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Another_Main.this, Advantage.class);
                startActivity(intent2);
            }
        });
        feature_DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Another_Main.this, Feature.class);
                startActivity(intent3);
            }
        });
        histoey_DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(Another_Main.this, History.class);
                startActivity(intent4);
            }
        });
        dataModel_DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(Another_Main.this, DataModel.class);
                startActivity(intent5);
            }
        });
        intro_SQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(Another_Main.this, IntroOfSQL.class);
                startActivity(intent6);
            }
        });
        Constriant_sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10=new Intent(Another_Main.this, ConstriantSQL.class);
                startActivity(intent10);
            }
        });
        DBMS_RDBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7=new Intent(Another_Main.this, DBMSvsRDBMS.class);
                startActivity(intent7);
            }
        });
        SQL_NOSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8=new Intent(Another_Main.this, SQLvsNOSQL.class);
                startActivity(intent8);
            }
        });
        PRI_FOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9=new Intent(Another_Main.this, PRIvsFOR.class);
                startActivity(intent9);
            }
        });
        Operator_SQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10=new Intent(Another_Main.this, Operator.class);
                startActivity(intent10);
            }
        });
        syntax_SQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnet11=new Intent(Another_Main.this, Syntax.class);
                startActivity(intnet11);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_my,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.secondItem:
                        Intent intent=new Intent(Another_Main.this, QuizActivity.class);
                        startActivity(intent);
                        return true;
            case R.id.ThirdItem:
                AlertDialog.Builder my=new AlertDialog.Builder(Another_Main.this);
                my.setTitle("Disclaimer");
                my.setMessage("इस ऍप में प्रस्तुत सामग्री इंटरनेट से इकट्ठा की गयी है | इस सामग्री पर हमारा किसी भी प्रकार का मालिकाना हक़ नहीं है और इस सामग्री के बारे में हम सभी प्रकार की यथार्थता को अमान्य करते है | ऍप में दिखाई गए किसी भी सामग्री पर आप का कोई व्यक्तिगत स्वामित्व / अधिकार मै है तो आप हमे आपके स्वामित्व / अधिकार के सबूत के साथ vishnupanchal3909@gmail.com पर e-mail कर हमें सूचित कर सकते है हम आपके दावे की सत्यता की जाँच कर वह सामग्री को तुरंत हटा देंगे।");
                my.create().show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (back_pressed + TIME_DELAY > System.currentTimeMillis())
        {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(), "Press once again to exit from APP!",
                    Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis();
    }
}