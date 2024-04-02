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

public class FragmentCalculateJajar extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_jajar,container,false);

        EditText alasJajar = view.findViewById(R.id.panjangAlasJajar);
        EditText tinggiJajar = view.findViewById(R.id.lebarSampingJajar);
        Button btnLuasJajar = view.findViewById(R.id.btnluasJajar);
        TextView hasilJajar = view.findViewById(R.id.hasilJajar);

        btnLuasJajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasJajar(alasJajar.getText().toString(), tinggiJajar.getText().toString());
            }
        });

        return view;
    }

    private void hitungLuasJajar(String alasStr, String tinggiStr) {
        if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double luas = alas * tinggi;
            TextView hasilTextView = getView().findViewById(R.id.hasilJajar);
            hasilTextView.setText(String.valueOf(luas));
        } else {
            Toast.makeText(getActivity(), "Please input side length and side base of parallelogram", Toast.LENGTH_SHORT).show();
        }
    }

}

