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

public class FragmentCalculatePersegi extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_persegi, container, false);

        EditText sisiPersegi = view.findViewById(R.id.sisiPersegi);
        Button btnLuasPersegi = view.findViewById(R.id.btnluasPersegi);

        btnLuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi(sisiPersegi.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasPersegi(String sisiStr) {
        if (!sisiStr.isEmpty()) {
            double sisi = Double.parseDouble(sisiStr);
            double luas = sisi * sisi;
            TextView hasilTextView = getView().findViewById(R.id.hasilPersegi);
            hasilTextView.setText(String.valueOf(luas));
        } else {
            Toast.makeText(getActivity(), "Please input side of square", Toast.LENGTH_SHORT).show();
        }
    }
}
