package com.example.myapplication;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setupListeners();
        setObservers();
        initialize();
        setContentView(binding.getRoot());
    }

    private void initialize() {
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
    }

    private void setupListeners() {
        clickMinus();
        clickPlus();

    }

    private void clickPlus() {
        binding.plus.setOnClickListener(v -> {
            viewModel.plus();
        });
    }

    private void clickMinus() {
        binding.button.setOnClickListener(v -> {
            viewModel.minus();
        });

    }

    //
    private void setObservers() {
        viewModel.count.observe(this, count -> {

            binding.text.setText(String.valueOf(count));

        });
    }
}