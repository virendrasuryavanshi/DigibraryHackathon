package com.example.cyberkillers.digibrary;

/**
 * Created by priyanshu on 15/4/17.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class Sub_Activity extends Activity{

    TextView tv;
//62626
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        setContentView(R.layout.sub_activity);
        super.onCreate(savedInstanceState);
        tv =(TextView)findViewById(R.id.tv);
        Intent intent = getIntent();
        String text = intent.getExtras().getString("thanhcs");
        tv.setText(""+text);
    }
}