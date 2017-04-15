package com.example.cyberkillers.digibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentInfo extends AppCompatActivity {
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        myDb = new DatabaseHelper(this);
    }
}
