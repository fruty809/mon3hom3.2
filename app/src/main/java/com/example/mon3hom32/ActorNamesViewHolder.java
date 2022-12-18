package com.example.mon3hom32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ActorNamesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvActorsNames;

    public ActorNamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvActorsNames = itemView.findViewById(R.id.tv_actornames);

    }
    public void bind(String ActorsName)
    {tvActorsNames.setText(ActorsName);}
}
