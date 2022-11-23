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

public class recyclerAdapter1  extends RecyclerView.Adapter<recyclerAdapter1.MyViewHolder>{

    Context context;
    ArrayList<model1>arrayModel1;

    recyclerAdapter1(Context context, ArrayList<model1>arrayModel1){
        this.context=context;
        this.arrayModel1=arrayModel1;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View v =  LayoutInflater.from ( context ).inflate ( R.layout.items1,parent,false );
        MyViewHolder myViewHolder = new MyViewHolder (v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource ( arrayModel1.get ( position ).image );
        holder.textView.setText ( arrayModel1.get ( position ).text );

    }

    @Override
    public int getItemCount() {
        return arrayModel1.size ();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super ( itemView );

            textView = itemView.findViewById ( R.id.textItem1 );
            imageView = itemView.findViewById ( R.id.imageView1 );
        }
    }
}
