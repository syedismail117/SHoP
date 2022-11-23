package com.example.shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter2 extends RecyclerView.Adapter<recyclerAdapter2.MyViewHolder2> {

    Context context;
    ArrayList<model2>arrayModel2;
    recyclerAdapter2 (Context context,ArrayList<model2>arrayModel2){
        this.context=context;
        this.arrayModel2=arrayModel2;

    }
    @NonNull
    @Override
    public recyclerAdapter2.MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =  LayoutInflater.from ( context ).inflate ( R.layout.items2,parent,false );
        MyViewHolder2 myViewHolder2 = new MyViewHolder2 (view);
        return myViewHolder2;

    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter2.MyViewHolder2 holder, int position) {

        holder.imageView1.setImageResource ( arrayModel2.get ( position ).image2 );
        holder.textView1.setText ( arrayModel2.get ( position ).text2 );

    }

    @Override
    public int getItemCount() {
        return arrayModel2.size ();
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {

        TextView textView1;
        ImageView imageView1;

        public MyViewHolder2(@NonNull View itemView) {
            super ( itemView );
            textView1=itemView.findViewById ( R.id.textItem2 );
            imageView1=itemView.findViewById ( R.id.imageView2 );

        }
    }
}
