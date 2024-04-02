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

public class FragmentCalculateKubus extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_kubus, container, false);

        EditText sisiKubus = view.findViewById(R.id.sisiKubus);
        Button btnLuasKubus = view.findViewById(R.id.btnluasKubus);

        btnLuasKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasKubus(sisiKubus.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasKubus(String sisiStr) {
        if (!sisiStr.isEmpty()) {
            double sisi = Double.parseDouble(sisiStr);
            double luasPermukaan = 6 * sisi * sisi;
            TextView hasilTextView = getView().findViewById(R.id.hasilKubus);
            hasilTextView.setText(String.valueOf(luasPermukaan));
        } else {
            Toast.makeText(getActivity(), "Please input side length of cube!", Toast.LENGTH_SHORT).show();
        }
    }
}
