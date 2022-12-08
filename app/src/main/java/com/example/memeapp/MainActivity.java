package com.example.memeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.memeapp.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int arr[] = {
         R.drawable.a,
         R.drawable.b,
         R.drawable.c,
        };

        binding.imageView.setImageResource(arr[0]);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = arr.length;
                Random random = new Random();

                int number = random.nextInt(temp);
                binding.imageView.setImageResource(arr[number]);
            }
        });

    }
}