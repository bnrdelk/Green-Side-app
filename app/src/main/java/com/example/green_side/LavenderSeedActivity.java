package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LavenderSeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavenderseed);
    }

    public void goToHome(View view){
        Intent intent = new Intent(LavenderSeedActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void goToAllSeeds(View view) {
        Intent intent = new Intent(LavenderSeedActivity.this, SeedActivity.class);
        startActivity(intent);
    }

    public void goToLavenderSeed(View view) {
        Intent intent = new Intent(LavenderSeedActivity.this, LavenderSeedActivity.class);
        startActivity(intent);
    }
    public void goToRoseSeed(View view) {
        Intent intent = new Intent(LavenderSeedActivity.this, RoseSeedActivity.class);
        startActivity(intent);
    }
    public void goToTulipSeed(View view) {
        Intent intent = new Intent(LavenderSeedActivity.this, TulipSeedActivity.class);
        startActivity(intent);
    }
}
