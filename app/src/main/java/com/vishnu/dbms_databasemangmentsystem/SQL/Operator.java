package com.vishnu.dbms_databasemangmentsystem.SQL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Operator extends AppCompatActivity {

    TextView description;
    Spinner spinner1,spinner2;
    String first,second,Third,Four,Five,Six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);

        spinner1 = findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        description = findViewById(R.id.description);


        first = "<br><b>AND</b> of letter display a record if all the condition seperted by <b>AND</b> are true.<br>" +
                "<br>&#160 &#160 &#160<b>Syntax :=</b><br><br>" +
                "&#160 &#160  <b>SELECT <b>Col1,Col2,Col3....</b> from TableName<br>" +
                "&#160 &#160 &#160 &#160 WHERE condition1 <b>AND</b> condition <b>AND</b> condition3...... ;<br></b>" +
                "<br><b>Example:-</b><br>" +
                "&#160 &#160 Q.Display the record of employee whose salary is less than 10000 and age greater than equal to 25?<br>" +
                "<br><u>Answer:-</u><br><br>&#160 &#160<u><b>Query</b></u><br><br>&#160 &#160<b>select * from employee where salary < 10000 <b>AND</b> age >=25 </b>";

        second = "<br><b>OR</b> operator display a record if anyone condition separted by <b>OR</b> is True<br>" +
                "<br><b>Syntax:-</b><br><br>" +
                "SELECT col1,col2,col3... from tablename WHERE condition1 <b>OR</b> condition2 ......   ;<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Display record of employee whose salary less then 10000 or age is greater then equal to 25<br><br>" +
                "&#160 &#160 &#160 <b>Select * from employee where salalry < 10000 <b>OR</b> age >= 25</b><br><br>";

        Third = "<br><b>NOT</b> operator display record if the condition is NOT ture.<br>" +
                "<br><b>Syntax:-</b><br><br>" +
                "SELECT col1,col2,col3... from Tablename WHERE <b>NOT</b> condition;<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Display record of employee who doesn't state city alandi.<br><br>" +
                "&#160 &#160 &#160 <b>Select * from employee where <b>NOT</b> city='alandi' </b>;<br><br>";

        Four = "<br><b>BETWEEN:-</b><br>" +
                "<br>This operator is used to select the value within given range.<br>" +
                "<br>It is inculsive operator i.e. begin and end value are inclued.<br>" +
                "<br><b>Syntax:-</b><br><br>" +
                "SELECT col1,col2,col3... from Tablename WHERE column_name BETWEEN value1 AND value2 ;<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Display record employee whoose are in between 15 to 25.<br><br>" +
                "&#160 &#160 &#160 <b>Select * from employee where age <b>Between</b> 15 AND 25</b>;<br><br>";

        Five = "<br><b>IN:-</b><br>" +
                "<br>It allow you to specify multiple value in where clause.<br>" +
                "<br>It is shorthand for multiple or <u>condition</u>.<br>" +
                "<br><b>Syntax:-</b><br><br>" +
                "SELECT col1,col2,col3... from Tablename WHERE column_name <b>IN</b> (value1 , value2 , value3 .......);<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.Display record  of employee wo state is city pune ,mumbai,nashik.<br><br>" +
                "&#160 &#160 &#160 <b>Select * from employee where City <b>IN</b> ('pune','mumbai','nashik');<br><br>";

        Six = "<br><b>LIKE:-</b><br>" +
                "<br>It is used for pattern matching.<br><br>Like operator use in where clause to search for specified pattern in column there are two wildcard character gives inconjuction with the like operator.<br>" +
                "<br>1.%d:-The percent sign represent 0,1 or multiple character.<br>" +
                "<br>2.'_':-Underscore represent single character.<br>" +
                "<br>The Percent sign(%) and Underscore(_) can also be used in combination.<br>" +
                "<br><b>Syntax:-</b><br><br>" +
                "SELECT col1,col2,col3... from Tablename WHERE column_name IN (value1 , value2 , value3 .......);<br><br>" +
                "<b>Example:-</b><br><br>" +
                "&#160 &#160 Q.select all employee with a employee name start with 's'.<br><br>" +
                "&#160 &#160 &#160 <b>select * from employee where ename <b>LIKE</b> 's%';</b><br><br>";

        String[] opfun=new String[]{
                "Select Operator or Function-->","Operator","Function"
        };
        ArrayAdapter arrayAdapter2=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,opfun);
        spinner1.setAdapter(arrayAdapter2);

        String[] function=new String[]{
                "Select-->","Min()","Max()","Count()","Avg()","Sum()"
        };
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, function);
//        spinner2.setAdapter(arrayAdapter3);

        String[] operator = new String[]{
                "Select->", "AND", "OR", "NOT", "BETWEEN", "IN", "LIKE"
        };
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, operator);
//        spinner2.setAdapter(arrayAdapter);


        String min="<br>The main function return the smallest value of selected column.<br>" +
                "<br><b>Syntax:-</b><br>" +
                "<br>SELECT <b>MIN(column_name)</b> from Tablename [where condition];<br>" +
                "<br><b>Example:-</b><br>" +
                "<br>Q.Find out minimun salary paid employee.<br>" +
                "<br><b>Answer:-</b><br>" +
                "&#160 &#160 &#160 select <b>min(salary)</b> from employee;";

        String max="<br>Max function retuen the largest value of selected column.<br>" +
                "<br><b>Syntax:-</b><br>" +
                "<br>SELECT <b>MAX(column_name)</b> from Tablename [where condition];<br>" +
                "<br><b>Example:-</b><br>" +
                "<br>Q.Find out maximun salary paid employee.<br>" +
                "<br><b>Answer:-</b><br>" +
                "&#160 &#160 &#160 select <b>max(salary)</b> from employee;";

        String count="<br>Count function return the no of row that matches specified condition if specified.<br>" +
                "<br><b>Syntax:-</b><br>" +
                "<br>SELECT <b>COUNT(column_name)</b> from Tablename [where condition];<br>" +
                "<br><b>Example:-</b><br>" +
                "<br>Q.Find out no of employee working all department.<br>" +
                "<br><b>Answer:-</b><br>" +
                "&#160 &#160 &#160 select <b>count(department_name)</b> from employee;<br>";

        String Avg="<br>Avg function always work on numeric data.<br>" +
                "<br>Avg function return average value of numeric value.<br>" +
                "<br><b>Syntax:-</b><br>" +
                "<br>SELECT <b>AVG(numeric_value)</b> from Tablename [where condition];<br>" +
                "<br><b>Example:-</b><br>" +
                "<br>Q.Find Avgerage value of salary of employee.<br>" +
                "<br><b>Answer:-</b><br>" +
                "&#160 &#160 &#160 select <b>avg(salary)</b> from employee;<br>";

        String sum="<br>Sum function return the total sum numeric column.<br>" +
                "<br><b>Syntax:-</b><br>" +
                "<br>SELECT <b>SUM(column_name)</b> from Tablename [where condition];<br>" +
                "<br><b>Example:-</b><br>" +
                "<br>Q.Find out total salary paid to employee.<br>" +
                "<br><b>Answer:-</b><br>" +
                "&#160 &#160 &#160 select <b>sum(salary)</b> from employee;<br>";



        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i)=="Operator"){
                    spinner2.setAdapter(arrayAdapter);
                    description.setText(null);
                            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if (adapterView.getItemAtPosition(i) == "AND") {
                                            description.setText(Html.fromHtml(first));
                                        }
                                        else if (adapterView.getItemAtPosition(i) == "OR") {
                                            description.setText(Html.fromHtml(second));
                                        }
                                        else if (adapterView.getItemAtPosition(i) == "NOT") {
                                            description.setText(Html.fromHtml(Third));
                                        }
                                        else if (adapterView.getItemAtPosition(i) == "BETWEEN") {
                                            description.setText(Html.fromHtml(Four));
                                        }
                                        else if (adapterView.getItemAtPosition(i) == "IN") {
                                            description.setText(Html.fromHtml(Five));
                                        }
                                        else if (adapterView.getItemAtPosition(i) == "LIKE") {
                                            description.setText(Html.fromHtml(Six));
                                        }
                                        else {
                                            description.setText(null);
                                            Toast.makeText(Operator.this, "Please,Select The Operator...!", Toast.LENGTH_SHORT).show();
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                }

                else if(adapterView.getItemAtPosition(i)=="Function"){
                    spinner2.setAdapter(arrayAdapter3);
                    description.setText(null);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if (adapterView.getItemAtPosition(i) == "Min()") {
                                description.setText(Html.fromHtml(min));
                            }
                            else if (adapterView.getItemAtPosition(i) == "Max()") {
                                description.setText(Html.fromHtml(max));
                            }
                            else if (adapterView.getItemAtPosition(i) == "Count()") {
                                description.setText(Html.fromHtml(count));
                            }
                            else if (adapterView.getItemAtPosition(i) == "Avg()") {
                                description.setText(Html.fromHtml(Avg));
                            }
                            else if (adapterView.getItemAtPosition(i) == "Sum()") {
                                description.setText(Html.fromHtml(sum));
                            }
                            else {
                                description.setText(null);
                                Toast.makeText(Operator.this, "Please,Select The Function...!", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

                else {
                    Toast.makeText(Operator.this, "Please,Select The Operator or Function....!", Toast.LENGTH_SHORT).show();
                    spinner2.setAdapter(null);
                    description.setText(null);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });











    }


}