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

public class FragmentCalculateBalok extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_balok, container, false);

        EditText lebarBalok = view.findViewById(R.id.lebarBalok);
        EditText panjangBalok = view.findViewById(R.id.panjangBalok);
        EditText tinggiBalok = view.findViewById(R.id.tinggiBalok);
        Button btnLuasBalok = view.findViewById(R.id.btnluasBalok);
        TextView hasilBalok = view.findViewById(R.id.hasilBalok);

        btnLuasBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasBalok(lebarBalok.getText().toString(), panjangBalok.getText().toString(), tinggiBalok.getText().toString(), hasilBalok);
            }
        });

        return view;
    }

    private void hitungLuasBalok(String lebarStr, String panjangStr, String tinggiStr, TextView hasilBalok) {
        if (!lebarStr.isEmpty() && !panjangStr.isEmpty() && !tinggiStr.isEmpty()) {
            double lebar = Double.parseDouble(lebarStr);
            double panjang = Double.parseDouble(panjangStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double luasPermukaan = 2 * (lebar * panjang + lebar * tinggi + panjang * tinggi);
            hasilBalok.setText(String.valueOf(luasPermukaan));
        } else {
            Toast.makeText(getActivity(), "Please input length, width, and height of cuboid!", Toast.LENGTH_SHORT).show();
        }
    }
}

