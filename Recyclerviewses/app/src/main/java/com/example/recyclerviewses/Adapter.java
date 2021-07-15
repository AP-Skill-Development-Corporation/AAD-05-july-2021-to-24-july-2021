package com.example.recyclerviewses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewholder> {

    Context  ctx;
    String title[];
    String subtitle[];
    int images[];

    public Adapter(Context ctx, String[] title, String[] subtitle, int[] images) {
        this.ctx = ctx;
        this.title = title;
        this.subtitle = subtitle;
        this.images = images;
    }

    @NonNull
    @Override
    public Adapter.MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewholder(LayoutInflater.from(ctx).inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewholder holder, int position) {
      holder.t1.setText(title[position]);
      holder.t2.setText(subtitle[position]);
      holder.imgs.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewholder extends RecyclerView.ViewHolder {
        ImageView imgs;
        TextView t1;
        TextView t2;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            imgs=itemView.findViewById(R.id.image);
            t1=itemView.findViewById(R.id.text1);
            t2=itemView.findViewById(R.id.text2);
        }
    }
}
