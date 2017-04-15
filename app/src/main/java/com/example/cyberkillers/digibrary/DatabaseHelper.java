package com.example.cyberkillers.digibrary;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vishal Anand on 15-Apr-17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "StudentsInfo.db";
    public static final String TABLE_NAME = "Students_Info";
    public static final String COL1 = "FIRST_NAME";
    public static final String COL2 = "LAST_NAME";
    public static final String COL3 = "SEMESTER";
    public static final String COL4 = "MAJORS";
    public static final String COL5 = "MINORS";
    public static final String COL6 = "HOBBIES";
    public static final String COL7 = "SKILLS";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (FIRST_NAME TEXT, LAST_NAME TEXT, SEMESTER TEXT, MAJORS TEXT, MINORS TEXT, HOBBIES TEXT, SKILLS TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String fname, String lname, String sem, String major, String minors, String hobby, String skills){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, fname);
        contentValues.put(COL2, lname);
        contentValues.put(COL3, sem);
        contentValues.put(COL4, major);
        contentValues.put(COL5, minors);
        contentValues.put(COL6, hobby);
        contentValues.put(COL7, skills);

        long result = db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
