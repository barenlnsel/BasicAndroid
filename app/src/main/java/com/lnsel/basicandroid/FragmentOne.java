package com.lnsel.basicandroid;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    private static View rootView;
    TextView tv_fag_one;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if (rootView != null) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (parent != null)
                parent.removeView(rootView);
        }
        try {
            rootView = inflater.inflate(R.layout.fragment_one, container, false);
        } catch (InflateException e) {

        }


        tv_fag_one=(TextView)rootView.findViewById(R.id.tv_fag_one);
        tv_fag_one.setText("Fragment One");


        return rootView;
    }
}
