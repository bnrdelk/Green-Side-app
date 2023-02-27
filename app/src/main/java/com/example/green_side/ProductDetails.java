package com.example.green_side;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prdetails);
    }

    public void goToAllSeeds(View view){
        Intent intent = new Intent(ProductDetails.this,SeedActivity.class);
        startActivity(intent);
    }

    public void goToShoppingCart(View view){
        Intent intent = new Intent(ProductDetails.this,SeedActivity.class);
        startActivity(intent);
    }
}
