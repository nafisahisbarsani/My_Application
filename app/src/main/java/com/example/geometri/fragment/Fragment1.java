package com.example.geometri.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.geometri.R;

public class Fragment1 extends Fragment {
    public Fragment1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);

        CardView persegiCard = view.findViewById(R.id.cvPersegi);
        persegiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFragment(new FragmentRumusPersegi());
            }
        });

        CardView panjagCard = view.findViewById(R.id.cvPanjang);
        panjagCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusPanjang());
            }
        });

        CardView segitigaCard = view.findViewById(R.id.cvSegitiga);
        segitigaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusSegitiga());
            }
        });

        CardView lingkaranCard = view.findViewById(R.id.cvLingkaran);
        lingkaranCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusLingkaran());
            }
        });

        CardView jajarCard = view.findViewById(R.id.cvJajar);
        jajarCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusJajar());
            }
        });
        CardView ketupatCard = view.findViewById(R.id.cvketupat);
        ketupatCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusKetupat());
            }
        });
        return view;
    }

    private void openFragment(Fragment fragment) {
        getParentFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
