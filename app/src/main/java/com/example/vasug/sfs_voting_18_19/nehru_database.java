package com.example.vasug.sfs_voting_18_19;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;



public class nehru_database  extends SQLiteOpenHelper {
    public static class table4info implements BaseColumns {
        public static final String TABLE_NAME = "nehru_db";
        public static final String can1 = "abc";
        public static final String can2 = "def";
        public static final String can3 = "ghi";
        public static final String can4 = "jkl";
        public static final String can5 = "mno";
        public static final String can6 = "pqr";
        public static final String can7 = "stu";
        public static final String can8 = "vwx";
    }
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + table4info.TABLE_NAME + " (" +
                    table4info.can1 + " integer, " +
                    table4info.can2 + " integer, " +
                    table4info.can3 + " integer, " +
                    table4info.can4 + " integer, " +
                    table4info.can5 + " integer, " +
                    table4info.can6 + " integer, " +
                    table4info.can7 + " integer, " +
                    table4info.can8 + " integer)";
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "VOTINGn.db";

    public nehru_database(Context context) {

        super(context, DATABASE_NAME,null , DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db4)   { db4.execSQL(SQL_CREATE_ENTRIES); }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void enter_data(nehru_database dop1, int can1, int can2, int can3 , int can4, int can5)
    {
        SQLiteDatabase ab1 = dop1.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(table4info.can1, can1);
        cv.put(table4info.can2, can2);
        cv.put(table4info.can3, can3);
        cv.put(table4info.can4, can4);
        cv.put(table4info.can5, can5);
        ab1.insert(table4info.TABLE_NAME, null, cv);
        ab1.close();
    }
    public void enter_data_c(nehru_database dop2, int can6,int can7, int can8 )
    {
        SQLiteDatabase ab2 = dop2.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(table4info.can6, can6);
        cv.put(table4info.can7, can7);
        cv.put(table4info.can8, can8);

        ab2.insert(table4info.TABLE_NAME, null, cv);
        ab2.close();
    }
}
