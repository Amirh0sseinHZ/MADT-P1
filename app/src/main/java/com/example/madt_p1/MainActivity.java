package com.example.madt_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvWelcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvWelcomeMsg = findViewById(R.id.twWelcomeMsg);
    }

    public void onBtnChangeTxtClick(View view) {
        tvWelcomeMsg.setText("Goodbye!");
    }

    public void onBtnChangeColorClick(View view) {
        tvWelcomeMsg.setTextColor(Color.BLUE);
    }
}