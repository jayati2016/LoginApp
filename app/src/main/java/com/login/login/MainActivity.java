package com.login.login;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
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
   private TextInputLayout textInputUsername;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPhone;
    private TextInputLayout textInputPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputUsername= findViewById(R.id.username);
        textInputEmail =  findViewById(R.id.email);
        textInputPhone= findViewById(R.id.phone);
        textInputPassword= findViewById(R.id.password);


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


        private boolean validateUsername() {
            String usernameInput = textInputUsername.getEditText().getText().toString().trim();

            if (usernameInput.isEmpty()) {
                textInputUsername.setError("Enter Username");
                return false;
            }
            else {
                textInputUsername.setError(null);
                return true;
            }
        }

    private boolean validateEmail() {
        String usernameInput = textInputEmail.getEditText().getText().toString().trim();

        if (usernameInput.isEmpty()) {
            textInputEmail.setError("Enter Email id");
            return false;
        }
        else {
            textInputEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        String usernameInput = textInputPassword.getEditText().getText().toString().trim();

        if (usernameInput.isEmpty()) {
            textInputPassword.setError("Enter a valid password");
            return false;
        }
        else {
            textInputPassword.setError(null);
            return true;
        }
    }

    private boolean validatePhone() {
        String usernameInput = textInputPhone.getEditText().getText().toString().trim();

        if (usernameInput.isEmpty()) {
            textInputPhone.setError("Enter Phone number");
            return false;
        } else if (usernameInput.length() != 10) {
            textInputPhone.setError("Invalid phone number");
            return false;
        } else {
            textInputPhone.setError(null);
            return true;
        }
    }


public  void  open(){
    if(!validateUsername()| !validateEmail()| !validatePassword()| !validatePhone()){
        return;}
        else{
        Intent intent = new Intent(this, Adisplay.class);
        startActivity(intent);

    }

}




    public void mopen() {

            Intent intent = new Intent(this, ActivityManager.class);
            startActivity(intent);
        }

    public void  act(View v){
      TextInputLayout text=findViewById(R.id.username);
        Intent i =new Intent(MainActivity.this, UserDetails.class);
            i.putExtra("message", text.getEditText().toString());
startActivity(i);}
}






