package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed);
    }

    public void goToRoseSeedDt(View view) {
        Intent intent = new Intent(SeedActivity.this, ProductDetails.class);
        startActivity(intent);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(SeedActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void goToAllSeeds(View view) {
        Intent intent = new Intent(SeedActivity.this, SeedActivity.class);
        startActivity(intent);
    }

    public void goToLavenderSeed(View view) {
        Intent intent = new Intent(SeedActivity.this, LavenderSeedActivity.class);
        startActivity(intent);
    }
    public void goToRoseSeed(View view) {
        Intent intent = new Intent(SeedActivity.this, RoseSeedActivity.class);
        startActivity(intent);
    }
    public void goToTulipSeed(View view) {
        Intent intent = new Intent(SeedActivity.this, TulipSeedActivity.class);
        startActivity(intent);
    }
}