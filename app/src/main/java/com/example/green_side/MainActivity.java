package com.example.green_side;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.green_side.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    public void goToInfo (View view){
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    public void goToFlowerScreen (View view){
        Intent intent = new Intent(MainActivity.this, FlowerActivity.class);
        startActivity(intent);
    }
    public void goToSeedScreen (View view){
        Intent intent = new Intent(MainActivity.this, SeedActivity.class);
        startActivity(intent);
    }
    public void goToBeautyScreen (View view){
        Intent intent = new Intent(MainActivity.this, BeautyActivity.class);
        startActivity(intent);
    }
    public void goToVaseScreen (View view){
        Intent intent = new Intent(MainActivity.this, VaseActivity.class);
        startActivity(intent);
    }

    public void goToDonate (View view){
        Intent intent = new Intent(MainActivity.this, DonateActivity.class);
        startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }

    protected void out() {
        mAuth.signOut();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));

    }

    public void goToNotifications (View view){
        Intent intent = new Intent(MainActivity.this, NotificationsActivity.class);
        startActivity(intent);
    }

}