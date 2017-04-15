package com.example.cyberkillers.digibrary;

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
        SQLiteDatabase db = this.getWritableDatabase();
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
}
