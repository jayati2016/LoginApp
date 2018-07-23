package com.login.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        TextView e=(TextView)findViewById(R.id.u_name);
        Bundle bu;
        bu=getIntent().getExtras();
        e.setText(bu.getString("message"));
    }
}
