package com.coderzf1.numberpickerlibraryjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.coderzf1.numberpickerlibraryjava.databinding.ActivityMainBinding;
import com.shawnlin.numberpicker.NumberPicker;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] colors = "Red,Green,Blue,Yellow,Magenta,Orange,Purple,Teal, Black, White".split(",");
        binding.numPicker.setDisplayedValues(colors);

        binding.numPicker.setOnValueChangedListener((picker, oldVal, newVal) -> {
            binding.textview.setText(colors[newVal - 1]);
        });
    }
}