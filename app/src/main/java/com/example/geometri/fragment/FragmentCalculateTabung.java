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

public class FragmentCalculateTabung extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_tabung, container, false);

        EditText radiusTabung = view.findViewById(R.id.radiusTabung);
        EditText tinggiTabung = view.findViewById(R.id.tinggiTabung);
        Button btnLuasTabung = view.findViewById(R.id.btnluasTabung);

        btnLuasTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasTabung(radiusTabung.getText().toString(), tinggiTabung.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasTabung(String radiusStr, String tinggiStr) {
        if (!radiusStr.isEmpty() && !tinggiStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double luasPermukaan = 2 * Math.PI * radius * (radius + tinggi);
            TextView hasilTextView = getView().findViewById(R.id.hasilTabung);
            hasilTextView.setText(String.valueOf(luasPermukaan));
        } else {
            Toast.makeText(getActivity(), "Please input radius and height of cylinder", Toast.LENGTH_SHORT).show();
        }
    }
}
