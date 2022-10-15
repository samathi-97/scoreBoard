package com.example.newlabtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryViewAdapter
        extends RecyclerView.Adapter< HistoryViewAdapter.ViewHolder>
{
    private List<String> mData;
    private LayoutInflater mInflater;
// data pass to constructor
    HistoryViewAdapter (Context context,List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

//store and recycle views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
    TextView myTextView;

    ViewHolder(View itemView){
        super(itemView);
        myTextView = itemView.findViewById(R.id.tv_score_history);
       }
    }
//inflate the row layout from xml when needed
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = mInflater.inflate(R.layout.history_cell,parent,false);
            return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewAdapter.ViewHolder holder, int position) {
    String history = mData.get(position);
    holder.myTextView.setText(history);
    }
//total number of items
    @Override
    public int getItemCount() {
        return mData.size();
    }


}



