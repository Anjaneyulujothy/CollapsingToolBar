package com.wce.pallapu.collapsingtoolbar;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;
import android.support.v7.widget.RecyclerView;

import com.iceteck.silicompressorr.SiliCompressor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;



public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    android.support.v7.widget.RecyclerView recyclerView;
    android.support.v7.widget.RecyclerView.Adapter adapter;
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
    ArrayList<Album> arrayList=new ArrayList<>();

    int [] img_id={R.drawable.panda,R.drawable.plane,R.drawable.panda,R.drawable.panda,R.drawable.panda,R.drawable.panda,R.drawable.panda,R.drawable.panda,
            R.drawable.panda,R.drawable.redcar,R.drawable.panda,R.drawable.schoolplayground,R.drawable.panda,R.drawable.panda,R.drawable.teacher,R.drawable.panda};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(android.support.v7.widget.RecyclerView)findViewById(R.id.recy);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);

      layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        for (int id: img_id)
        {




            arrayList.add(new Album(id));

        }

        adapter=new com.wce.pallapu.collapsingtoolbar.RecyclerView(arrayList);

        recyclerView.setAdapter(adapter);
        }
    }

