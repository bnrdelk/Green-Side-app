package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TulipSeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulipseed);
    }

    public void goToHome(View view){
        Intent intent = new Intent(TulipSeedActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void goToAllSeeds(View view) {
        Intent intent = new Intent(TulipSeedActivity.this, SeedActivity.class);
        startActivity(intent);
    }

    public void goToLavenderSeed(View view) {
        Intent intent = new Intent(TulipSeedActivity.this, LavenderSeedActivity.class);
        startActivity(intent);
    }
    public void goToRoseSeed(View view) {
        Intent intent = new Intent(TulipSeedActivity.this, RoseSeedActivity.class);
        startActivity(intent);
    }
    public void goToTulipSeed(View view) {
        Intent intent = new Intent(TulipSeedActivity.this, TulipSeedActivity.class);
        startActivity(intent);
    }
}
