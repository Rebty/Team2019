package com.rebty.team2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText activity_login_editText_login;
    EditText activity_login_editText_password;
    Button activity_login_button_login;
    Button activity_login_button_forgetPassword;
    Button activity_login_button_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        activity_login_editText_login = (EditText) findViewById(R.id.activity_login_editText_login);
        activity_login_editText_password = (EditText) findViewById(R.id.activity_login_editText_password);
        activity_login_button_login = (Button) findViewById(R.id.activity_login_button_login);
        activity_login_button_forgetPassword = (Button) findViewById(R.id.activity_login_button_forgetPassword);
        activity_login_button_registration = (Button) findViewById(R.id.activity_login_button_registration);

        activity_login_button_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), RegistrationActivity.class));
            }
        });
    }



}
