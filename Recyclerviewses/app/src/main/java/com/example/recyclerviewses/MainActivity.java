package com.example.recyclerviewses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViews;
    String title[];
    String subtitle[];
    int images[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting the id from xml
        recyclerViews=findViewById(R.id.recyclerview);
        title=new String[]{"Anusha","Balu","Chandu","dihwiaj","eagle"};
        subtitle=new String[]{"anusha","balu","chandu","dhwija","eagle"};
        images=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    Adapter adapter=new Adapter(this,title,subtitle,images);
    recyclerViews.setLayoutManager(new LinearLayoutManager(this));
    recyclerViews.setAdapter(adapter);


    }
}