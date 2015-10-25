package com.rebty.team2019.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rebty.team2019.R;

public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, null);

        return v;
    }
    public void backButtonWasPressed() {
        // TODO Auto-generated method stub
        Toast.makeText(getActivity(), "Back button pressed", Toast.LENGTH_LONG)
                .show();
    }
}
