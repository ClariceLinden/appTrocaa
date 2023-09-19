package com.example.apptroca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nomeGet, sobrenomeGet;
    Button botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    
        nomeGet = findViewById(R.id.nomeGet);
        sobrenomeGet = findViewById(R.id.sobrenomeGet);
        botaoEnviar = findViewById(R.id.botaoEnviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // pega o nome e o sobrenome
                String nome = nomeGet.getText().toString();
                String sobrenome;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nomeCompleto", nome);

            }
        });
    }
}