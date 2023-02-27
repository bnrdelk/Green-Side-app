package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RoseSeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roseseed);
    }

    public void goToHome(View view){
        Intent intent = new Intent(RoseSeedActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void goToAllSeeds(View view) {
        Intent intent = new Intent(RoseSeedActivity.this, SeedActivity.class);
        startActivity(intent);
    }

    public void goToLavenderSeed(View view) {
        Intent intent = new Intent(RoseSeedActivity.this, LavenderSeedActivity.class);
        startActivity(intent);
    }
    public void goToRoseSeed(View view) {
        Intent intent = new Intent(RoseSeedActivity.this, RoseSeedActivity.class);
        startActivity(intent);
    }
    public void goToTulipSeed(View view) {
        Intent intent = new Intent(RoseSeedActivity.this, TulipSeedActivity.class);
        startActivity(intent);
    }
}
