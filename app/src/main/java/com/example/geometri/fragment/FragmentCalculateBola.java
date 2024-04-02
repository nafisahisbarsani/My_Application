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

public class FragmentCalculateBola extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_bola, container, false);

        EditText radiusBola = view.findViewById(R.id.radiusBola);
        Button btnLuasBola = view.findViewById(R.id.btnluasBola);
        TextView hasilBola = view.findViewById(R.id.hasilBola);

        btnLuasBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasBola(radiusBola.getText().toString(), hasilBola);
            }
        });

        return view;
    }

    private void hitungLuasBola(String radiusStr, TextView hasilBola) {
        if (!radiusStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double luasPermukaan = 4 * Math.PI * Math.pow(radius, 2);
            hasilBola.setText(String.valueOf(luasPermukaan));
        } else {
       Toast.makeText(getActivity(), "Please input radius of the sphere", Toast.LENGTH_SHORT).show();
        }
    }
}
