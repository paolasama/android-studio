package com.example.anime_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para ir a la siguiente página
    public void goToNextPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    // Método para ir a ThirdActivity
    public void goToThirdPage(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    // Método para ir a FourActivity
    public void goTofourPage(View view) {
        Intent intent = new Intent(this, FourActivity.class);
        startActivity(intent);
    }
}
