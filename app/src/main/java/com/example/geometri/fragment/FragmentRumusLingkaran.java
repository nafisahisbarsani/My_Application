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

public class FragmentRumusLingkaran extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rumus_lingkaran, container, false);

        TextView formulaTextView = view.findViewById(R.id.txtlingkaran);
        if (getArguments() != null) {
            String formula = getArguments().getString("formula", "");
            formulaTextView.setText(formula);
        }

        Button btnLingkaran = view.findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHitungLuasFragment();
            }
        });

        return view;
    }

    private void openHitungLuasFragment() {
        FragmentCalculateLingkaran fragment= new FragmentCalculateLingkaran();
        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}




