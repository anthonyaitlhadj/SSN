package com.example.aaitlhadj.ssn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button bRegister;
    EditText NAME, AGE, USERNAME, /*radioButton, radioButton1,*/ VILLE, MAIL, PASSWORD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        NAME = (EditText) findViewById(R.id.NAME);
        AGE = (EditText) findViewById(R.id.AGE);
        /*radioButton = ()findViewById(R.id.radioButton);
        radioButton1 = ()findViewById(R.id.radioButton1);*/
        USERNAME = (EditText) findViewById(R.id.USERNAME);
        VILLE = (EditText) findViewById(R.id.VILLE);
        MAIL = (EditText) findViewById(R.id.MAIL);
        PASSWORD = (EditText) findViewById(R.id.PASSWORD);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bRegister:
                startActivity(new Intent(this, Login.class));
            break;
        }
    }
}
