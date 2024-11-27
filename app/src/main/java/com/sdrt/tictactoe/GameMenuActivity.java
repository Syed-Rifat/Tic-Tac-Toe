package com.sdrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);

        Button btn3x3Mode = findViewById(R.id.btn3x3Mode);
        Button btn4x4Mode = findViewById(R.id.btn4x4Mode);

        // Navigate to the 3x3 game activity
        btn3x3Mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameMenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to the 4x4 game activity
        btn4x4Mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameMenuActivity.this, Game4x4Activity.class);
                startActivity(intent);
            }
        });
    }
}
