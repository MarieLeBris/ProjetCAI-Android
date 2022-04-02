package com.example.tomf_marielb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String penguin_name[], penguin_description[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        penguin_name = getResources().getStringArray(R.array.penguin_name);
        penguin_description = getResources().getStringArray(R.array.penguin_description);

        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this, penguin_name, penguin_description);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}