package com.example.geometri.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.geometri.R;

public class Fragment2 extends Fragment {

    public Fragment2(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2, container, false);

        CardView kerucutCard = view.findViewById(R.id.cvKerucut);
        kerucutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFragment(new FragmentRumusKerucut());
            }
        });

        CardView kubusCard = view.findViewById(R.id.cvKubus);
        kubusCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusKubus());
            }
        });

        CardView balokCard = view.findViewById(R.id.cvBalok);
        balokCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusBalok());
            }
        });

        CardView bolaCard = view.findViewById(R.id.cvBola);
        bolaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusBola());
            }
        });

        CardView prismaSegitigaCard = view.findViewById(R.id.cvPrisma);
        prismaSegitigaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new FragmentRumusPrismaSegitiga());
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

