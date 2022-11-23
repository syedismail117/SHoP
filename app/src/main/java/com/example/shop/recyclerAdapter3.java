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

public class recyclerAdapter3 extends RecyclerView.Adapter<recyclerAdapter3.MyViewHolder>{

    Context context;
    ArrayList<model3> arrayModel3;

    recyclerAdapter3(Context context, ArrayList<model3> arrayModel3){
        this.context=context;
        this.arrayModel3=arrayModel3;

    }


    @NonNull
    @Override
    public recyclerAdapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from ( context ).inflate ( R.layout.items3,parent,false );
        MyViewHolder myViewHolder=new MyViewHolder ( view );
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter3.MyViewHolder holder, int position) {

        holder.imageView.setImageResource ( arrayModel3.get ( position ).image );
        holder.textView.setText ( arrayModel3.get ( position ).text );

    }

    @Override
    public int getItemCount() {
        return arrayModel3.size ();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super ( itemView );

            textView=itemView.findViewById ( R.id.textHro );
            imageView=itemView.findViewById ( R.id.imageHor );
        }
    }
}
