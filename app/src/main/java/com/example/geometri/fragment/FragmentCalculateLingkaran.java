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

public class FragmentCalculateLingkaran extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_lingkaran, container, false);

        EditText radiusLingkaran = view.findViewById(R.id.radiusLingkaran);
        Button btnLuasLingkaran = view.findViewById(R.id.btnluasLingkaran);

        btnLuasLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLingkaran(radiusLingkaran.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasLingkaran(String radiusStr) {
        if (!radiusStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double luasPermukaan = Math.PI * radius * radius;
            TextView hasilTextView = getView().findViewById(R.id.hasilLingkaran);
            hasilTextView.setText(String.valueOf(luasPermukaan));
        } else {
            Toast.makeText(getActivity(), "Please input radius of circle", Toast.LENGTH_SHORT).show();
        }
    }
}
