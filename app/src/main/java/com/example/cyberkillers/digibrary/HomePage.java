package com.example.cyberkillers.digibrary;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class HomePage extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);,,pl,pkjhjuhi
//        setContentView(R.layout.activity_home_page);
//    }
//}

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class HomePage extends Activity {

    EditText editsearch;
    ListView listView;
    private ArrayList<String> mItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        editsearch = (EditText)findViewById(R.id.editText1);
        listView = (ListView)findViewById(R.id.listView1);
        Button recommend_button = (Button) findViewById(R.id.recommend_button);

        mItems = new ArrayList<String>();
        mItems.add("Diary of a Wimpy Kid 6: Cabin Fever");
        mItems.add("Steve Jobs");
        mItems.add("Inheritance (The Inheritance Cycle)");
        mItems.add("11/22/63: A Novel");
        mItems.add("The Hunger Games");
        mItems.add("The LEGO Ideas Book");
        mItems.add("Explosive Eighteen: A Stephanie Plum Novel");
        mItems.add("Catching Fire (The Second Book of the Hunger Games)");
        mItems.add("Elder Scrolls V: Skyrim: Prima Official Game Guide");
        mItems.add("Death Comes to Pemberley");
        mItems.add("Diary of a Wimpy Kid 6: Cabin Fever");
        mItems.add("Steve Jobs");
        mItems.add("Inheritance (The Inheritance Cycle)");
        mItems.add("11/22/63: A Novel");
        mItems.add("The Hunger Games");
        mItems.add("The LEGO Ideas Book");
        mItems.add("Explosive Eighteen: A Stephanie Plum Novel");
        mItems.add("Catching Fire (The Second Book of the Hunger Games)");
        mItems.add("Elder Scrolls V: Skyrim: Prima Official Game Guide");
        mItems.add("Death Comes to Pemberley");

        listView.setAdapter(new CustomArrayAdapter(HomePage.this, mItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()  {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(HomePage.this, Sub_Activity.class);
                intent.putExtra("thanhcs",mItems.get(position));
                startActivity(intent); //when you click,

                //open new activity and intent text this is it
            }


        });
        recommend_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
               startActivity(new Intent(getApplicationContext(),Recommendations.class));
            }
        });


        editsearch.addTextChangedListener(new TextWatcher() { //edit search
            //Event when changed word on EditTex
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ArrayList<String> temp = new ArrayList<String>();
                int textlength = editsearch.getText().length();
                temp.clear();
                for (int i = 0; i < mItems.size(); i++)
                {
                    if (textlength <= mItems.get(i).length())
                    {
                        if(editsearch.getText().toString().equalsIgnoreCase(
                                (String)
                                        mItems.get(i).subSequence(0,
                                                textlength)))
                        {
                            temp.add(mItems.get(i));
                        }
                    }
                }
                listView.setAdapter(new CustomArrayAdapter(HomePage.this, temp));
            }


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });

    }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

}
