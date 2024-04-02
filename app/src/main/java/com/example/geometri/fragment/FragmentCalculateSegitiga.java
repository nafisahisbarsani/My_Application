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

public class FragmentCalculateSegitiga extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_segitiga, container, false);

        EditText tinggiSegitiga = view.findViewById(R.id.tinggiSegitiga);
        EditText alasSegitiga = view.findViewById(R.id.alasSegitiga);
        Button btnLuasSegitiga = view.findViewById(R.id.btnluasSegitiga);

        btnLuasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga(tinggiSegitiga.getText().toString(), alasSegitiga.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasSegitiga(String tinggiStr, String alasStr) {
        if (!tinggiStr.isEmpty() && !alasStr.isEmpty()) {
            double tinggi = Double.parseDouble(tinggiStr);
            double alas = Double.parseDouble(alasStr);
            double luas = 0.5 * alas * tinggi;
            TextView hasilTextView = getView().findViewById(R.id.hasilSegitiga);
            hasilTextView.setText(String.valueOf(luas));
        } else {
            Toast.makeText(getActivity(), "Please input base and height of triangle", Toast.LENGTH_SHORT).show();
        }
    }
}
