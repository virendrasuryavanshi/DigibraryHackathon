package com.example.cyberkillers.digibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentInfo extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText et_Fname, et_Lname, et_Sem, et_Majors, et_Minor, et_Hobby, et_Skills;
    Button b_Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        myDb = new DatabaseHelper(this);
        et_Fname = (EditText)findViewById(R.id.et_fname);
        et_Lname = (EditText)findViewById(R.id.et_lname);
        et_Sem = (EditText)findViewById(R.id.et_sem);
        et_Majors = (EditText)findViewById(R.id.et_major);
        et_Minor = (EditText)findViewById(R.id.et_minor);
        et_Hobby = (EditText)findViewById(R.id.et_hobby);
        et_Skills = (EditText)findViewById(R.id.et_skills);
        b_Submit = (Button)findViewById(R.id.b_submitStudentsInfo);

        addData();
    }
    public void addData(){
        b_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(et_Fname.getText().toString(),
                        et_Lname.getText().toString(),
                        et_Sem.getText().toString(),
                        et_Majors.getText().toString(),
                        et_Minor.getText().toString(),
                        et_Hobby.getText().toString(),
                        et_Skills.getText().toString());
                if(isInserted==true) {
                    Toast.makeText(StudentInfo.this, "Data Inserted!", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),HomePage.class));
                }
                else
                    Toast.makeText(StudentInfo.this,"Data Not Inserted!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
