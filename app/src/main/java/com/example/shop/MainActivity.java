package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CardView card1,card2,card3,card4,card5,card6;

    ImageCarousel imageCarousel;
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3;

    ArrayList<model1> arrayModel1 = new ArrayList<> ();
    ArrayList<model2>arrayModel2 = new ArrayList<> ();
    ArrayList<model3>arrayModel3 = new ArrayList<> ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        //card view items
        card1=findViewById ( R.id.card1 );
        card2=findViewById ( R.id.card2 );
        card3=findViewById ( R.id.card3 );
        card4=findViewById ( R.id.card4 );
        card5=findViewById ( R.id.card5 );
        card6=findViewById ( R.id.card6 );

        card1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( MainActivity.this, "Apple Watch", Toast.LENGTH_SHORT ).show ();
            }
        } );

        card2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( MainActivity.this, "Puma", Toast.LENGTH_SHORT ).show ();
            }
        } );

        card3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( MainActivity.this, "converse", Toast.LENGTH_SHORT ).show ();
            }
        } );

        card4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( MainActivity.this, "Nike", Toast.LENGTH_SHORT ).show ();
            }
        } );

        card5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( MainActivity.this, "louis vuitton", Toast.LENGTH_SHORT ).show ();
            }
        } );

        card6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( MainActivity.this, "ZARA", Toast.LENGTH_SHORT ).show ();
            }
        } );
        //end of cardView items

        // for image carousel

        imageCarousel= findViewById ( R.id.carousel );

        imageCarousel.addData ( new CarouselItem (R.drawable.blackfridaysale,"Sale") );
        imageCarousel.addData ( new CarouselItem (R.drawable.grenadid) );
        imageCarousel.addData ( new CarouselItem (R.drawable.juiceoffr) );
        imageCarousel.addData ( new CarouselItem (R.drawable.makeupoffr) );
        imageCarousel.addData ( new CarouselItem (R.drawable.cosmt) );
        imageCarousel.addData ( new CarouselItem (R.drawable.erephn) );
        //image carousel is closed

        //recyclerview

        recyclerView1 = findViewById ( R.id.recyclerView1 );
        recyclerView2 = findViewById ( R.id.recyclerView2 );
        recyclerView3=findViewById ( R.id.recyclerView3 );

        layoutManager1 = new GridLayoutManager ( this,3 );
        layoutManager2 =new GridLayoutManager ( this,2 );
        layoutManager3=new LinearLayoutManager ( MainActivity.this,LinearLayoutManager.HORIZONTAL,false );

        //set the layout manager in desired recyclerview

        recyclerView1.setLayoutManager ( layoutManager1 );
        recyclerView2.setLayoutManager ( layoutManager2 );
        recyclerView3.setLayoutManager ( layoutManager3 );


        //array list for model 1

        arrayModel1.add ( new model1 ( R.drawable.shopping,"Fashion" ) );
        arrayModel1.add ( new model1 ( R.drawable.maleclothes,"Men" ) );
        arrayModel1.add ( new model1 ( R.drawable.womanclothes,"Women" ) );
        arrayModel1.add ( new model1 ( R.drawable.babyclothing,"Kids" ) );
        arrayModel1.add ( new model1 ( R.drawable.sports,"Sport" ) );
        arrayModel1.add ( new model1 ( R.drawable.gym,"Fitness" ) );
        arrayModel1.add ( new model1 ( R.drawable.iphone,"Mobile" ) );
        arrayModel1.add ( new model1 ( R.drawable.tv,"TV" ) );
        arrayModel1.add ( new model1 ( R.drawable.shoes,"FootWare" ) );
        //array list for model 1

        recyclerAdapter1 adapter1 =new recyclerAdapter1 ( this,arrayModel1 );
        recyclerView1.setAdapter ( adapter1 );

        //recyclerview2
        arrayModel2.add ( new model2 ( R.drawable.nikeair,"Nike Air" ) );
        arrayModel2.add ( new model2 ( R.drawable.pumatshirt,"puma" ) );
        arrayModel2.add ( new model2 ( R.drawable.sunglassfast,"SunGlass" ) );
        arrayModel2.add ( new model2 ( R.drawable.cargo,"Cargo" ) );
        arrayModel2.add ( new model2 ( R.drawable.blazer,"Blazer" ) );
        arrayModel2.add ( new model2 ( R.drawable.americanbag,"Bag" ) );
        arrayModel2.add ( new model2 ( R.drawable.hoodies,"Hoodies" ) );
        arrayModel2.add ( new model2 ( R.drawable.addssho,"Adidas" ) );

        recyclerAdapter2 adapter2=new recyclerAdapter2 (this,arrayModel2);
        recyclerView2.setAdapter ( adapter2 );

        //arrayModel3 is horizontal recyclerview

        arrayModel3.add ( new model3 ( R.drawable.bands,"Fit Bands" ) );
        arrayModel3.add ( new model3 ( R.drawable.beauty1,"Beauty" ) );
        arrayModel3.add ( new model3 ( R.drawable.perfume,"Perfumes" ) );
        arrayModel3.add ( new model3 ( R.drawable.highheel,"Heels" ) );
        arrayModel3.add ( new model3 ( R.drawable.jacket,"Jackets" ) );
        arrayModel3.add ( new model3 ( R.drawable.jewelry,"Jewelry" ) );
        arrayModel3.add ( new model3 ( R.drawable.womanjkt,"Jackets" ) );
        arrayModel3.add ( new model3 ( R.drawable.camera,"Camera" ) );

        recyclerAdapter3 adapter3=new recyclerAdapter3 (this,arrayModel3);
        recyclerView3.setAdapter ( adapter3);


    }
}