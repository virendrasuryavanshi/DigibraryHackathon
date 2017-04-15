package com.example.cyberkillers.digibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class StudentInfo extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText et_Fname, et_Lname, et_Sem, et_Majors, et_Minors, et_Hobby, et_Skills;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        myDb = new DatabaseHelper(this);
    }
}
