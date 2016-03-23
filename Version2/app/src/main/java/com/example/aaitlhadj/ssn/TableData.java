package com.example.aaitlhadj.ssn;

import android.provider.BaseColumns;

/**
 * Created by aaitlhadj on 19/03/16.
 */
public class TableData {

    public TableData(){

    }

    public static abstract class TableInfo implements BaseColumns{
        public static final String NAME = "name";
        public static final String AGE = "age";
        public static final String USERNAME = "username";
        public static final String VILLE = "ville";
        public static final String MAIL = "mail";
        public static final String PASSWORD = "password";
        public static final String DATABASE_NAME = "SSN";
        public static final String TABLE_NAME = "users";
    }
}
