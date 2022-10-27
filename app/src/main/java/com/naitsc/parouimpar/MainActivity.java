package com.naitsc.parouimpar;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.naitsc.parouimpar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(binding.numero.getText().toString());
                int resultado = number % 2;

                if (resultado == 0) {
                    binding.resultado.setText("Par!");
                } else {
                    binding.resultado.setText("Impar!");
                }

            }
        });
    }
}