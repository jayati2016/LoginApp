package com.login.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button mbutton;
    EditText et_username;
    EditText et_email;
    EditText et_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username = (EditText) findViewById(R.id.et_username);
        et_email = (EditText) findViewById(R.id.et_email);
        et_phone = (EditText) findViewById(R.id.et_phone);


        button = (Button) findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });

        mbutton = (Button) findViewById(R.id.btn_manager);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mopen();
            }
        });
    }

    public void open() {
        boolean isValid = true;
        if (et_username.getText().toString().isEmpty()) {
            et_username.setError("Invalid Username");
            isValid = false;
        }
        if (et_email.getText().toString().isEmpty()){
            et_email.setError("Please enter your id");
            isValid = false;
        }
        if (et_phone.getText().length()!=10){
            et_phone.setError("Enter a valid phone number");
            isValid = false;
        }
        if (isValid) {
            Intent intent = new Intent(this, Adisplay.class);

            startActivity(intent);
        }
    }


    public void mopen() {

            Intent intent = new Intent(this, ActivityManager.class);
            startActivity(intent);
        }
    }








