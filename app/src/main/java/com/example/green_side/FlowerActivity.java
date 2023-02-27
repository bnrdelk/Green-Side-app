package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FlowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(FlowerActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void goToAllFlowers(View view) {
        Intent intent = new Intent(FlowerActivity.this, FlowerActivity.class);
        startActivity(intent);
    }
    public void goToLavender(View view) {
        Intent intent = new Intent(FlowerActivity.this, LavenderActivity.class);
        startActivity(intent);
    }
    public void goToRose(View view) {
        Intent intent = new Intent(FlowerActivity.this, RoseActivity.class);
        startActivity(intent);
    }
    public void goToTulip(View view) {
        Intent intent = new Intent(FlowerActivity.this, TulipActivity.class);
        startActivity(intent);
    }
}
