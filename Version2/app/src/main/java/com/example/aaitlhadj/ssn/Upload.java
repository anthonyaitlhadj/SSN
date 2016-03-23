package com.example.aaitlhadj.ssn;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;


public class Upload extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView1;
    //SQLITE
    SQLiteDatabase bdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        imageView1 = (ImageView)this.findViewById(R.id.imageView1);
        bdd = this.openOrCreateDatabase("test.bdd", Context.MODE_PRIVATE, null);
        bdd.execSQL("create table if not exists tb (a blob)");
    }

    public void saveImage(View view) {
        try {
            FileInputStream fis = new FileInputStream("/storage/1B0B-141A/LOST.DIR/HelloK.png");
            byte[] image = new byte[fis.available()];
            fis.read(image);


            //Manipulation Base de données
            ContentValues values = new ContentValues();
            values.put("a", image);
            bdd.insert("tb", null, values);

            fis.close();

            Toast.makeText(this, "insert success", Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getImage(View view){
        Cursor c = bdd.rawQuery("select * from tb", null);
        if(c.moveToNext()){
            byte[] image = c.getBlob(0);
            Bitmap bmp = BitmapFactory.decodeByteArray(image, 0, image.length);
            imageView1.setImageBitmap(bmp);
            Toast.makeText(this, "select success", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bImg:
                startActivity(new Intent(this, Profil.class));
            break;
        }
    }
}