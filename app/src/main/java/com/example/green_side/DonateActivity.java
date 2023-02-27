package com.example.green_side;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(DonateActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void goToOneTreePlant(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tema.org.tr/anasayfa")));
    }
}