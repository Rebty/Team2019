package com.rebty.team2019.Activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rebty.team2019.Fragments.LoginFragment;
import com.rebty.team2019.Fragments.RegistrationFragment;
import com.rebty.team2019.Fragments.StartFragment;
import com.rebty.team2019.R;

public class MainActivity extends AppCompatActivity {

    Fragment startFragment, registrationFragment, loginFragment;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    String nowFragmentShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startFragment = new StartFragment();
        registrationFragment = new RegistrationFragment();
        loginFragment = new LoginFragment();

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.appContent, startFragment);
        fragmentTransaction.commit();
        nowFragmentShow = "startFragment";
    }

    public void onClick(View v) {

        fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.fragment_start_button_registration:
                fragmentTransaction.replace(R.id.appContent, registrationFragment);
                nowFragmentShow = "registrationFragment";
                break;
            case R.id.fragment_start_button_login:
                fragmentTransaction.replace(R.id.appContent, loginFragment);
                nowFragmentShow = "loginFragment";
                break;
            case R.id.fragment_login_textView_forgetPassword:
                break;
            default:
                break;
        }

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        switch (nowFragmentShow) {
            case "registrationFragment":
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, startFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowFragmentShow = "startFragment";
                break;
            case "loginFragment":
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.appContent, startFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                nowFragmentShow = "startFragment";
                break;
            case "startFragment":
                super.onBackPressed();
                nowFragmentShow = "";
                break;
            default:
                break;
        }
    }
}


