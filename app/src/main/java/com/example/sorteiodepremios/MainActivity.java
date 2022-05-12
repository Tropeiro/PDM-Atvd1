package com.example.sorteiodepremios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txt_sorteado;
    private Button btnSorteio;


    String vetor[] = {"R$ 1.000", "R$ 2.000", "R$ 3.000", "Carro 0KM", "Motocicleta", "Casa",
                        "Viagem", "Smartphone", "Apartamento"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSorteio = findViewById(R.id.btnSorteio);
        txt_sorteado = findViewById(R.id.txt_sorteado);
    }

    public void Premiacao(View view){
        int num = new Random().nextInt(vetor.length);
        txt_sorteado.setText("O Prêmio sorteado foi: " + vetor[num]);
    }
}