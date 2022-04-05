package com.example.tomf_marielb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    String data1[], data2[];
    Context context;
    public RecycleViewAdapter(Context ct, String penguin_name[], String penguin_description[]){
        context = ct;
        data1 = penguin_name;
        data2 = penguin_description;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, InformationsPenguinsActivity.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                context.startActivity(intent);
            }
        });

        //holder.myImage.setImageResource();

    }

    @Override
    public int getItemCount() {
        return data2.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1, myText2;
        ImageView myImage;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.text_penguin_name);
            myText2 = itemView.findViewById(R.id.text_penguin_description);
            myImage = itemView.findViewById(R.id.my_imageview);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
