package com.example.mon3hom32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActorNamesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<String> ActorsNamesList;
    public ActorNamesAdapter(ArrayList<String> contactList) {
        this.ActorsNamesList = contactList;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ActorNamesViewHolder
                (LayoutInflater.from(parent.getContext()).inflate(R.layout.item_actornames, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.bind(ActorsNamesList.get(position));
    }

    @Override
    public int getItemCount() {
        return ActorsNamesList.size();
    }
}
