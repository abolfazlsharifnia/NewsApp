package com.example.news;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView text_tittle, text_source;
    ImageView image_headline;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        text_tittle = itemView.findViewById(R.id.text_tittle);
        text_source = itemView.findViewById(R.id.text_source);
        image_headline = itemView.findViewById(R.id.img_headline);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
