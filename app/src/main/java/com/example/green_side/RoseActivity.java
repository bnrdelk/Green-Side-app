package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(RoseActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void goToAllFlowers(View view) {
        Intent intent = new Intent(RoseActivity.this, FlowerActivity.class);
        startActivity(intent);
    }
    public void goToLavender(View view) {
        Intent intent = new Intent(RoseActivity.this, LavenderActivity.class);
        startActivity(intent);
    }
    public void goToRose(View view) {
        Intent intent = new Intent(RoseActivity.this, RoseActivity.class);
        startActivity(intent);
    }
    public void goToTulip(View view) {
        Intent intent = new Intent(RoseActivity.this, TulipActivity.class);
        startActivity(intent);
    }
}