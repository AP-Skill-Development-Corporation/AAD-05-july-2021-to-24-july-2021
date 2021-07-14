package com.example.tabnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
     ViewPager vp;
     TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(vp);
        //ViewPagerAdapter vpa=new ViewPagerAdapter(getSupportFragmentManager());
      //calling the inner class .
        ViewPagerAdapter vpa=new ViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(vpa);
    }
    class ViewPagerAdapter extends FragmentStatePagerAdapter {
        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }
      //based on the position we will get the fragment
        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return new Camera();
                case 1:return new Chats();
                case 2:return new Calls();
            }
            return null;
        }
    //The following method helps the viewpager understand about how many total fragments are there to display on the viewpaper.
        @Override
        public int getCount() {
            return 3;
        }
       //To display some value to the tab.
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:return "Camera";
                case 1:return "Chats";
                case 2:return "Calls";
            }
            return super.getPageTitle(position);
        }
    }
}