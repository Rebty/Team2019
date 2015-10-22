package com.rebty.team2019;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Fragment {

    EditText activity_login_editText_login;
    EditText activity_login_editText_password;
    Button activity_login_button_login;
    Button activity_login_button_forgetPassword;
    Button activity_login_button_registration;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_login, null);
        activity_login_editText_login = (EditText) v.findViewById(R.id.activity_login_editText_login);
        activity_login_editText_password = (EditText) v.findViewById(R.id.activity_login_editText_password);
        activity_login_button_login = (Button) v.findViewById(R.id.activity_login_button_login);
        activity_login_button_forgetPassword = (Button) v.findViewById(R.id.activity_login_button_forgetPassword);
        activity_login_button_registration = (Button) v.findViewById(R.id.activity_login_button_registration);

        activity_login_button_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), RegistrationActivity.class));
            }
        });
        return v;
    }


}
