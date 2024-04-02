package com.example.geometri.fragment;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.geometri.R;

public class FragmentCalculateKerucut extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_kerucut, container, false);

        EditText radiusKerucut = view.findViewById(R.id.radiusKerucut);
        EditText slantHeightKerucut = view.findViewById(R.id.tinggiMiringKerucut);
        Button btnLuasKerucut = view.findViewById(R.id.btnLuasKerucut);
        TextView hasilKerucut = view.findViewById(R.id.hasilKerucut);

        btnLuasKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasKerucut(radiusKerucut.getText().toString(), slantHeightKerucut.getText().toString(), hasilKerucut);
            }
        });

        return view;
    }

    private void hitungLuasKerucut(String radiusStr, String slantHeightStr, TextView hasilKerucut) {
        if (!radiusStr.isEmpty() && !slantHeightStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double slantHeight = Double.parseDouble(slantHeightStr);
            double luasPermukaan = Math.PI * radius * (radius + slantHeight);
            hasilKerucut.setText(String.valueOf(luasPermukaan));
        } else {
            Toast.makeText(getActivity(), "Please input radius and slant height of cone", Toast.LENGTH_SHORT).show();
        }
    }
}
