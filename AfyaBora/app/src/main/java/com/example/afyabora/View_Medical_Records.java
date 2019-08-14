package com.example.afyabora;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class View_Medical_Records extends AppCompatActivity {
EditText pname;
EditText page;
EditText P_age;
EditText Pproblem;
EditText P_problem;
EditText Dateofoccurance;
Button add;
EditText med;
SQLiteDatabase database;
    private recyclerviewadapter recyclerviewadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__medical__records);
        pname=(EditText)findViewById(R.id.name);
        page=(EditText)findViewById(R.id.Age);
        P_age=(EditText)findViewById(R.id.cage);
        Pproblem=(EditText)findViewById(R.id.ail);
        P_problem=(EditText)findViewById(R.id.gail);
        Dateofoccurance=(EditText)findViewById(R.id.date);
        add=(Button)findViewById(R.id.save);
        med=(EditText)findViewById(R.id.meds);
        database=openOrCreateDatabase("Medicalhistory",MODE_PRIVATE,null);
        database.execSQL("CREATE TABLE IF NOT EXISTS medhistoryy(Patient_name VARCHAR(255) NOT NULL,Patient_Age_During_Occurence VARCHAR(255)NOT NULL,Patient_Current_Age INTEGER(1000)NOT NULL,Patient_Ailment VARCHAR(255)NOT NULL,Patient_Hereditary_Ailment VARCHAR(255),Date_of_Occurence VARCHAR(255) NOT NULL,Medication_taken VARCHAR(255)NOT NULL)");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String upname=pname.getText().toString();
                String upage=page.getText().toString();
                String uPage=P_age.getText().toString();
                String uPproblem=Pproblem.getText().toString();
                String u_P_problem=P_problem.getText().toString();
                String udate=Dateofoccurance.getText().toString();
                String umed=med.getText().toString();

                if (upname.isEmpty()||upage.isEmpty()||uPage.isEmpty()||uPproblem.isEmpty()||udate.isEmpty()||umed.isEmpty()){
                    Toast.makeText(View_Medical_Records.this, "Please enter details", Toast.LENGTH_SHORT).show();
                }else{
                    database.execSQL("INSERT INTO medhistoryy(Patient_name,Patient_Age_During_Occurence,Patient_Current_Age,Patient_Ailment,Patient_Hereditary_Ailment,Date_of_Occurence,Medication_taken) VALUES('"+upname+"','"+upage+"','"+uPage+"','"+uPproblem+"','"+u_P_problem+"','"+udate+"','"+umed+"')");
                    Toast.makeText(View_Medical_Records.this, "Records added successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
