package com.example.examentoms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1.-Tab
    private final String[] nombres = new String[]{"Pestaña 1","Pestaña 2"};
    // 4.- Java
    static List<Integer> MINUTO = Arrays.asList( // tiempo en que entra
            0,   4,  7, 10,     17, 22, 30, 45, 50);
    static List<String> VARIEDAD = Arrays.asList( //tipo de naranja
            "valencia",  "navel",  "valencia", "clementina",
            "navel",  "valencia", "clementina", "valencia" );
    static List<Double> DIAMETRO = Arrays.asList( //diámetro medio en cm
            8.0, 9.0, 7.0, 3.0,       6.0, 9.0, 4.0, 6.0);
    static List<Naranjas> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.- Tab
        ViewPager2 viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new MiPagerAdapter(this));
        TabLayout tabs = findViewById(R.id.tabs);
        new TabLayoutMediator(tabs, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position){
                        tab.setText(nombres[position]);
                    }
                }
        ).attach();
        // 4.- Java
        lista = Naranjas.creaLista(MINUTO, VARIEDAD, DIAMETRO);
        Log.d("Examen", lista.toString());

    }

    // 1.- Tab
    public static class MiPagerAdapter extends FragmentStateAdapter {

        public MiPagerAdapter(FragmentActivity activity){
            super(activity);
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0: return new Tab1();
                case 1: return new Tab2();
            }
            return null;
        }
    }
}