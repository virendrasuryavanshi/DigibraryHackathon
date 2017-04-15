package com.example.cyberkillers.digibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StudentInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Button nybutton = (Button) findViewById(R.id.homepageopen);
        nybutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(StudentInfo.this,HomePage.class);
                startActivity(numbersIntent);

//                  Toast.makeText(view.getContext(),"Open the List Of Numbers",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
