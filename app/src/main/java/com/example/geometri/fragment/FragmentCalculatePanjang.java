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

public class FragmentCalculatePanjang extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate_panjang, container, false);

        EditText panjangPanjang = view.findViewById(R.id.panjangPersegiPanjang);
        EditText lebarPanjang = view.findViewById(R.id.lebarPersegiPanjang);
        Button btnLuasPanjang = view.findViewById(R.id.btnluasPersegiPanjang);
        TextView hasilPanjang = view.findViewById(R.id.hasilPersegiPanjang);

        btnLuasPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi(panjangPanjang.getText().toString(), lebarPanjang.getText().toString(), hasilPanjang);
            }
        });

        return view;
    }

    private void hitungLuasPersegi(String panjangStr, String lebarStr, TextView hasilPanjang) {
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double luas = panjang * lebar;
            hasilPanjang.setText(String.valueOf(luas));
        } else {
            Toast.makeText(getActivity(), "Please input width and length of rectangle", Toast.LENGTH_SHORT).show();
        }
    }
}
