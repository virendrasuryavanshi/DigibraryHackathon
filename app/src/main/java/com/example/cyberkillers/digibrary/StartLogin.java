package com.example.cyberkillers.digibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartLogin extends AppCompatActivity {
    EditText et_Username, et_Password;
    TextView tv_Invalid;
    Button b_Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_login);

        et_Username = (EditText)findViewById(R.id.et_username);
        et_Password = (EditText)findViewById(R.id.et_password);
        tv_Invalid = (TextView)findViewById(R.id.tv_invalid);
        b_Login = (Button)findViewById(R.id.b_login);
        onLogin();
    }
    public void onLogin(){
        b_Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String User = et_Username.getText().toString();
                String Pass = et_Password.getText().toString();
                if(User.equals("abc") && Pass.equals("def")){
                    Toast.makeText(StartLogin.this,"Welcome "+User,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),StudentInfo.class));
                }
                else{
                    tv_Invalid.setText("Invalid Username or Password!");
                    Toast.makeText(StartLogin.this,"User/Pass = "+User+Pass,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
