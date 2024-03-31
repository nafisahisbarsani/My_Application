package com.example.geometri.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.geometri.R;

public class FragmentRumusBalok extends Fragment {
    public FragmentRumusBalok() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rumus_balok, container, false);

        TextView formulaTextView = view.findViewById(R.id.txtbalok);
        if (getArguments() != null) {
            String formula = getArguments().getString("formula", "");
            formulaTextView.setText(formula);
        }

        return view;
    }
}


