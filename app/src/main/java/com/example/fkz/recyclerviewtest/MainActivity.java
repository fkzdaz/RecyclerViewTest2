package com.example.fkz.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Dog> dogList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogs();
        RecyclerView recyclerview= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutmanager=new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutmanager);
        DogAdapter adapter=new DogAdapter(dogList);
        recyclerview.setAdapter(adapter);
    }

    private void initDogs() {
        for (int i=0;i<3;i++){
            Dog d1=new Dog("d1",R.drawable.dog1);
            dogList.add(d1);
            Dog d2=new Dog("d2",R.drawable.dog2);
            dogList.add(d1);
            Dog d3=new Dog("d3",R.drawable.dog3);
            dogList.add(d3);
            Dog d4=new Dog("d4",R.drawable.dog4);
            dogList.add(d1);
            Dog d5=new Dog("d5",R.drawable.dog5);
            dogList.add(d5);
        }
    }
}
