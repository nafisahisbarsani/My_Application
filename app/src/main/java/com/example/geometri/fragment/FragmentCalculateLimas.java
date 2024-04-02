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

public class FragmentCalculateLimas extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_limas, container, false);

        EditText basePerimeterLimas = view.findViewById(R.id.sisiAlasLimas);
        EditText baseAreaLimas = view.findViewById(R.id.luasAlasLimas);
        EditText tinggiLimas = view.findViewById(R.id.tinggiLimas);
        Button btnLuasLimas = view.findViewById(R.id.btnluasLimas);

        btnLuasLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLimas(basePerimeterLimas.getText().toString(), baseAreaLimas.getText().toString(), tinggiLimas.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasLimas(String basePerimeterStr, String baseAreaStr, String tinggiStr) {
        if (!basePerimeterStr.isEmpty() && !baseAreaStr.isEmpty() && !tinggiStr.isEmpty()) {
            double basePerimeter = Double.parseDouble(basePerimeterStr);
            double baseArea = Double.parseDouble(baseAreaStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double luasPermukaan = (basePerimeter * tinggi) / 2 + baseArea;
            TextView hasilTextView = getView().findViewById(R.id.hasilLimas);
            hasilTextView.setText(String.valueOf(luasPermukaan));
        } else {
            Toast.makeText(getActivity(), "Please input base perimeter, base area, and height!", Toast.LENGTH_SHORT).show();
        }
    }
}
