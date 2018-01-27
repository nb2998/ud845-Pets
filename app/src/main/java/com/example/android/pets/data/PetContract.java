package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by nishtha on 25/1/18.
 */

public final class PetContract {

    //commonly used commands

    public static final String CREATE_TABLE = "CREATE TABLE ";
    public static final String DROP_TABLE = "DROP TABLE ";
    public static final String INTEGER = " INTEGER ";
    public static final String TEXT = " TEXT ";
    public static final String WHERE = " WHERE ";
    public static final String IF_EXISTS = " IF EXISTS ";
    public static final String LBR = " (";
    public static final String RBR = " )";
    public static final String COMMA = " ,";
    public static final String SEMICOLON = ";";
    public static final String NOT_NULL = " NOT NULL ";
    public static final String PRIMARY_KEY = " PRIMARY KEY ";
    public static final String AUTOINCREMENT = " AUTOINCREMENT ";

        public static final class PetEntry implements BaseColumns {
            //Table name and columns
            public static final String TABLE_NAME = "Pets";
            public static final String _ID = BaseColumns._ID;
            public static final String COLUMN_PET_NAME = "Name";
            public static final String COLUMN_PET_GENDER = "Gender";
            public static final String COLUMN_PET_BREED = "Breed";
            public static final String COLUMN_PET_WEIGHT = "Weight";

            public static final int GENDER_MALE = 1;
            public static final int GENDER_FEMALE = 2;
            public static final int GENDER_UNKNOWN = 0;


        }




}
