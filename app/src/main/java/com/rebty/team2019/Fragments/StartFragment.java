package com.rebty.team2019.Fragments;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rebty.team2019.R;

public class StartFragment extends Fragment {

    Button a,b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_start, container, false);

        a = (Button) v.findViewById(R.id.fragment_start_button_registration);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PFDinDisplayPro-Black.ttf");
        a.setTypeface(font);

        return v;
    }
}
