package com.example.ilyan.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class register extends AppCompatActivity implements View.OnClickListener {

    Button bRegister;
    EditText etName, etAge, etUsername, /*radioButton, radioButton1,*/ etVille, etMail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etNname);
        etAge = (EditText) findViewById(R.id.etAge);

        /*radioButton = ()findViewById(R.id.radioButton);
        radioButton1 = ()findViewById(R.id.radioButton1);*/
        etUsername = (EditText) findViewById(R.id.etUsername);
        etVille = (EditText) findViewById(R.id.etVille);
        etMail = (EditText) findViewById(R.id.etMail);
        etPassword = (EditText) findViewById(R.id.etPassword);

        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bRegister:

                String name = etName.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String  ville = etVille.getText().toString();
                String mail = etMail.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());

                User registerData = new User(name, age, username, password, mail, ville);

                break;


        }
    }
}