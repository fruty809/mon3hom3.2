package com.example.mon3hom32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView actorsNamesRecyclerView;
    private ArrayList<String> ActorsNamesList = new ArrayList<>();
    private ActorNamesAdapter adapter = new ActorNamesAdapter(ActorsNamesList);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        actorsNamesRecyclerView.setAdapter(adapter);
    }
    private void loadData(){
        ActorsNamesList.add("Jack Nicholson");
        ActorsNamesList.add("Leonardo DiCaprio");
        ActorsNamesList.add("Morgan Freeman");
        ActorsNamesList.add("Johnny Depp");
        ActorsNamesList.add("Bruce Lee");
        ActorsNamesList.add("Angelina Jolie");
        ActorsNamesList.add("Samuel L. Jackson");
        ActorsNamesList.add("Chadwick Boseman");
        ActorsNamesList.add("Antonio Banderas");
        ActorsNamesList.add("Brad Pitt");
        ActorsNamesList.add("Robert Downey Jr");
        ActorsNamesList.add(" Jim Carrey");
    }
}