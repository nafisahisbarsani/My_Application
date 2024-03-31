package com.example.geometri;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.geometri.fragment.Fragment1;
import com.example.geometri.fragment.Fragment2;
import com.example.geometri.fragment.Fragment3;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Fragment1())
                .commit();
    }
    public BottomNavigationView.OnItemSelectedListener navListener=
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.menu_item1) {
                        selectedFragment = new Fragment1();
                    } else if (item.getItemId() == R.id.menu_item2) {
                        selectedFragment = new Fragment2();
                    } else if (item.getItemId() == R.id.menu_item3) {
                        selectedFragment = new Fragment3();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selectedFragment)
                            .commit();

                    return true;
                }
            };
}





