package com.example.newlabtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ArrayList<String> scoreHistory = new ArrayList<>();
        scoreHistory.add("SL vs AUS - 59/9 SL won by 4 runs");
        scoreHistory.add("SL vs PAK - 45/9 SL won by 42 runs");
        scoreHistory.add("SL vs NZ - 159/9 SL won by 3 runs");
        scoreHistory.add("SL vs ENG - 180/9 SL won by 2 runs");
        scoreHistory.add("SL vs IND - 132/9 SL won by 1 runs");

        RecyclerView rvScoreHistory = findViewById(R.id.rv_score_history);
        rvScoreHistory.setLayoutManager(new LinearLayoutManager(this));
        HistoryViewAdapter adapter = new HistoryViewAdapter(this,scoreHistory);
        rvScoreHistory.setAdapter(adapter);


    }
}