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

public class FragmentCalculateKetupat extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_ketupat, container, false);

        EditText diagonal1 = view.findViewById(R.id.d1Ketupat);
        EditText diagonal2 = view.findViewById(R.id.d2Ketupat);
        Button btnLuasBelahKetupat = view.findViewById(R.id.btnluasKetupat);

        btnLuasBelahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasBelahKetupat(diagonal1.getText().toString(), diagonal2.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasBelahKetupat(String diagonal1Str, String diagonal2Str) {
        if (!diagonal1Str.isEmpty() && !diagonal2Str.isEmpty()) {
            double diagonal1 = Double.parseDouble(diagonal1Str);
            double diagonal2 = Double.parseDouble(diagonal2Str);
            double luas = 0.5 * diagonal1 * diagonal2;
            TextView hasilTextView = getView().findViewById(R.id.hasilKetupat);
            hasilTextView.setText(String.valueOf(luas));
        } else {
            Toast.makeText(getActivity(), "Please input the first and second diagonal first!", Toast.LENGTH_SHORT).show();
        }
    }
}
