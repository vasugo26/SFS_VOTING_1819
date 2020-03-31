package com.example.vasug.sfs_voting_18_19;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Vasu on 4/27/2017.
 */

public class tagore_database  extends SQLiteOpenHelper {

    public static class table3info implements BaseColumns {
        public static final String TABLE_NAME = "tagore_db";
        public static final String can1 = "abc";
        public static final String can2 = "def";
        public static final String can3 = "ghi";
        public static final String can4 = "jkl";
        public static final String can5 = "mno";
        public static final String can6 = "pqr";
        public static final String can7 = "stu";

    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + tagore_database.table3info.TABLE_NAME + " (" +
                    table3info.can1 + " integer, " +
                    table3info.can2 + " integer, " +
                    table3info.can3 + " integer, " +
                    table3info.can4 + " integer, " +
                    table3info.can5 + " integer, " +
                    table3info.can6 + " integer, " +
                    table3info.can7 + " integer)";

    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "VOTINGt.db";

    public tagore_database(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db3) { db3.execSQL(SQL_CREATE_ENTRIES); }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void enter_data(tagore_database dop1, int can1, int can2, int can3 , int can4)
    {
        SQLiteDatabase ab1 = dop1.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(table3info.can1, can1);
        cv.put(table3info.can2, can2);
        cv.put(table3info.can3, can3);

        cv.put(table3info.can4, can4);
        ab1.insert(table3info.TABLE_NAME, null, cv);
        ab1.close();
    }
    public void enter_data_c(tagore_database dop2, int can5,int can6, int can7 )
    {
        SQLiteDatabase ab2 = dop2.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(table3info.can5, can5);
        cv.put(table3info.can6, can6);
        cv.put(table3info.can7, can7);

        ab2.insert(table3info.TABLE_NAME, null, cv);
        ab2.close();

        SQLiteDatabase ab3  = dop2.getWritableDatabase();
        ContentValues cv2 = new ContentValues();
        cv.put();

    }
}
