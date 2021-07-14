package com.example.navigationcomponents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {



    public HomeFragment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);

    View v=inflater.inflate(R.layout.fragment_home,container,false);
        Button red=v.findViewById(R.id.red);
        Button blue=v.findViewById(R.id.blue);
        Button green=v.findViewById(R.id.green);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate logies here
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_redFragment);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_blueFragment);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_greenFragment);

            }
        });
    return v;



    }
}