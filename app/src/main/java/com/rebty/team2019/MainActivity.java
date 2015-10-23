package com.rebty.team2019;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment loginact
            ,regact;
    FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginact=new LoginActivity();
        regact=new RegistrationActivity();

        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.frgmCont, loginact);
        fTrans.commit();
    }
    public void onClick(View v){
        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.activity_login_button_registration:
                fTrans.replace(R.id.frgmCont, regact);
                break;

            //case R.id.btnReplace:
              //  fTrans.replace(R.id.frgmCont, frag2);
            default:
                break;
        }
        fTrans.addToBackStack(null);
        fTrans.commit();
    }
    }


