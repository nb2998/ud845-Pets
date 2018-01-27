package com.example.android.pets.data;

import static com.example.android.pets.data.PetContract.*;
import static com.example.android.pets.data.PetContract.PetEntry.*;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by nishtha on 25/1/18.
 */

public class DbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "shelter_db";
    public static final int DATABASE_VERSION = 1;
    private static final String TAG = "TAG";

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = CREATE_TABLE + TABLE_NAME +
                LBR + _ID + INTEGER + PRIMARY_KEY + AUTOINCREMENT + COMMA +
                COLUMN_PET_NAME + TEXT + NOT_NULL + COMMA +
                COLUMN_PET_BREED + TEXT + COMMA +
                COLUMN_PET_GENDER +TEXT + COMMA +
                COLUMN_PET_WEIGHT + INTEGER + RBR +SEMICOLON;
        Log.d(TAG, "onCreate: "+SQL_CREATE_PETS_TABLE);
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String SQL_DELETE_PETS_TABLE = DROP_TABLE + IF_EXISTS +TABLE_NAME + SEMICOLON;
        Log.d(TAG, "onUpgrade: "+SQL_DELETE_PETS_TABLE);
        db.execSQL(SQL_DELETE_PETS_TABLE);
        onCreate(db);
    }
}
