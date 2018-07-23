package com.login.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.Menu;

public class ActivityManager extends AppCompatActivity {
    EditText et_mid;
    EditText et_memail;
    EditText et_mdept;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        et_mid=(EditText)findViewById(R.id.et_mid);
        et_memail=(EditText)findViewById(R.id.et_memail);
        et_mdept=(EditText)findViewById(R.id.et_mdept);
        button=(Button)findViewById(R.id.btn_mlogin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });
    }

    public void open(){
        boolean isValid= true;
        if (et_mid.getText().toString().isEmpty()) {
            et_mid.setError("Invalid Id");
            isValid = false;
        }
        if (et_memail.getText().toString().isEmpty()){
            et_memail.setError("Please enter your email");
            isValid = false;
        }
        if (et_mdept.getText().toString().isEmpty()){
            et_mdept.setError("Enter department");
            isValid = false;
        }
        if (isValid) {
            Intent intent = new Intent(this, UserDetails.class);

            startActivity(intent);
        }

    }

    }

