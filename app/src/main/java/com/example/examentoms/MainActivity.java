package com.example.examentoms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    // 1.-Tab
    private final String[] nombres = new String[]{"Pestaña 1","Pestaña 2"};

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