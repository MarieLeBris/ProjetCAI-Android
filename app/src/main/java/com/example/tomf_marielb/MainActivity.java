package com.example.tomf_marielb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] penguin_name, penguin_description;
    int[] images = {R.drawable.madagascar_penguins,R.drawable.pingu,R.drawable.tux,
            R.drawable.nils_olav, R.drawable.bibounde,R.drawable.minable_le_pingouin,
            R.drawable.petit_pingouin,R.drawable.grand_pingouin,R.drawable.gorfou_sauteur, R.drawable.oswald_cc};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        penguin_name = getResources().getStringArray(R.array.penguin_name);
        penguin_description = getResources().getStringArray(R.array.penguin_description);

        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this, penguin_name, penguin_description, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}