package com.vishnu.dbms_databasemangmentsystem.AboutDBMS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.vishnu.dbms_databasemangmentsystem.R;

public class Advantage extends AppCompatActivity {

    TextView adv,dis;
    String advanatage,disadvantage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advantage);
        adv=findViewById(R.id.textView3);
        dis=findViewById(R.id.textView5);
        advanatage="<b>1. Improved data sharing:-\n</b><br>&#160 &#160 &#160 &#160" +
                " An advantage of the database management approach is, the DBMS helps to create an environment in which end users have better access to more and better-managed data.Such access makes it possible for end users to respond quickly to changes in their environment." +
                "<br><br><b>2. Improved data security:-\n</b><br>&#160 &#160 &#160 &#160The more users access the data, the greater the risks of data security breaches. Corporations invest considerable amounts of time, effort, and money to ensure that corporate data are used properly. A DBMS provides a framework for better enforcement of data privacy and security policies." +
                "<br><br><b>3. Better data integration:-\n</b><br>&#160 &#160 &#160 &#160Wider access to well-managed data promotes an integrated view of the organization’s operations and a clearer view of the big picture. It becomes much easier to see how actions in one segment of the company affect other segments." +
                "<br><br><b>4. Minimized data inconsistency:-\n</b><br>&#160 &#160 &#160 &#160Data inconsistency exists when different versions of the same data appear in different places. For example, data inconsistency exists when a company’s sales department stores a sales representative’s name as “Bill Brown” and the company’s personnel department stores that same person’s name as “William G. Brown,” or when the company’s regional sales office shows the price of a product as $45.95 and its national sales office shows the same product’s price as $43.95. The probability of data inconsistency is greatly reduced in a properly designed database." +
                "<br><br><b>5. Improved data access:-\n</b><br>&#160 &#160 &#160 &#160The DBMS makes it possible to produce quick answers to ad hoc queries. From a database perspective, a query is a specific request issued to the DBMS for data manipulation—for example, to read or update the data. Simply put, a query is a question, and an ad hoc query is a spur-of-the-moment question. The DBMS sends back an answer (called the query result set) to the application. For example, end users, when dealing with large amounts of sales data, might want quick answers to questions (ad hoc queries) such as:- What was the dollar volume of sales by product during the past six months?- What is the sales bonus figure for each of our salespeople during the past three months?- How many of our customers have credit balances of 3,000 or more?" +
                "<br><br><b>6. Improved decision making:-\n</b><br>&#160 &#160 &#160 &#160Better-managed data and improved data access make it possible to generate better-quality information, on which better decisions are based. The quality of the information generated depends on the quality of the underlying data. Data quality is a comprehensive approach to promoting the accuracy, validity, and timeliness of the data. While the DBMS does not guarantee data quality, it provides a framework to facilitate data quality initiatives." +
                "<br><br><b>7. Increased end-user productivity:-\n</b><br>&#160 &#160 &#160 &#160The availability of data, combined with the tools that transform data into usable information, empowers end users to make quick, informed decisions that can make the difference between success and failure in the global economy.Till now we have seen different benefits of database management systems. But it has certain limitations or disadvantages.Let's find various disadvantages of database system.<br>";
        disadvantage="<br>&#160 &#160 &#160 &#160 Although the database system yields considerable advantages over previous data management approaches, database systems do carry significant disadvantages. For example:\n" +
                " \n" +
                "<br><br><b>1. Increased costs:-\n</b><br>" +
                "one of the disadvantages of dbms is Database systems require sophisticated hardware and software and highly skilled personnel. The cost of maintaining the hardware, software, and personnel required to operate and manage a database system can be substantial. Training, licensing, and regulation compliance costs are often overlooked when database systems are implemented.\n" +
                "<br><br><b>2. Management complexity:-\n</b><br>" +
                "Database systems interface with many different technologies and have a significant impact on a company’s resources and culture. The changes introduced by the adoption of a database system must be properly managed to ensure that they help advance the company’s objectives. Given the fact that database systems hold crucial company data that are accessed from multiple sources, security issues must be assessed constantly.\n" +
                "<br><br><b>3. Maintaining currency:-\n</b><br>" +
                "To maximize the efficiency of the database system, you must keep your system current. Therefore, you must perform frequent updates and apply the latest patches and security measures to all components.\n" +
                "Because database technology advances rapidly, personnel training costs tend to be significant. Vendor dependence. Given the heavy investment in technology and personnel training, companies might be reluctant to change database vendors.\n" +
                "As a consequence, vendors are less likely to offer pricing point advantages to existing customers, and those customers might be limited in their choice of database system components.\n" +
                "<br><br><b>4. Frequent upgrade/replacement cycles:-\n</b><br>" +
                "DBMS vendors frequently upgrade their products by adding new functionality. Such new features often come bundled in new upgrade versions of the software. Some of these versions require hardware upgrades. Not only do the upgrades themselves cost money, but it also costs money to train database users and administrators to properly use and manage the new features.\n";
        adv.setText(Html.fromHtml(advanatage));
        dis.setText(Html.fromHtml(disadvantage));

        }
}