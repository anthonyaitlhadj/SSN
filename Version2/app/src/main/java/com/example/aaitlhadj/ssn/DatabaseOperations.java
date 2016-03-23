package com.example.aaitlhadj.ssn;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by aaitlhadj on 19/03/16.
 */
public abstract class DatabaseOperations extends SQLiteOpenHelper {
    public static final int database_version = 1;
    public String CREATE_QUERY = "CREATE_TABLE"+ TableData.TableInfo.TABLE_NAME+"("+
            TableData.TableInfo.NAME+" Text,"+
            TableData.TableInfo.AGE+" Text,"+
            TableData.TableInfo.USERNAME+" Text,"+
            TableData.TableInfo.VILLE+" Text,"+
            TableData.TableInfo.MAIL+" email,"+
            TableData.TableInfo.PASSWORD+" Text);";

    public DatabaseOperations(Context context){
        super(context, TableData.TableInfo.DATABASE_NAME, null, database_version);
        Log.d("Database operations", "Database created");
    }

    @Override
    public void onCreate(SQLiteDatabase sdb){
        sdb.execSQL(CREATE_QUERY);
        Log.d("Database operations", "Table created");
    }

    public void putInformation(DatabaseOperations dop,String name,String age,String username,String ville,String mail,String password){
        SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(TableData.TableInfo.NAME, name);
        cv.put(TableData.TableInfo.AGE, age);
        cv.put(TableData.TableInfo.USERNAME, username);
        cv.put(TableData.TableInfo.VILLE, ville);
        cv.put(TableData.TableInfo.MAIL, mail);
        cv.put(TableData.TableInfo.PASSWORD, password);
        long k = SQ.insert(TableData.TableInfo.TABLE_NAME, null, cv);
        Log.d("Database operations", "One raw inserted");
    }

}
