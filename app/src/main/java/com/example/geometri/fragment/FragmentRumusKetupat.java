package com.example.geometri.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.geometri.R;

public class FragmentRumusKetupat extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rumus_ketupat, container, false);

        TextView formulaTextView = view.findViewById(R.id.txtketupat);
        if (getArguments() != null) {
            String formula = getArguments().getString("formula", "");
            formulaTextView.setText(formula);
        }

        Button btnKetupat = view.findViewById(R.id.btnKetupat);
        btnKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHitungLuasFragment();
            }
        });

        return view;
    }

    private void openHitungLuasFragment() {
        FragmentCalculateKetupat fragment = new FragmentCalculateKetupat();
        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}