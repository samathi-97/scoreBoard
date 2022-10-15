package com.example.newlabtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cont = findViewById(R.id.btn_count);
        Button tost = findViewById(R.id.btn_tost);
        TextView score = findViewById(R.id.tv_score);

        tost.setOnClickListener(v -> {
               CharSequence text = "The score is" + score.getText()+"!";
                Toast toast_message = Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG);
                toast_message.show();
        });

        cont.setOnClickListener(v -> {
            int score_count = Integer.parseInt(score.getText().toString());
            score_count += 1;
            score.setText(String.valueOf(score_count));
        });
    }
}