package com.example.beto.restaurantedochef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMesas extends AppCompatActivity {

    private Button botaoMesa1;
    private Button botaoMesa2;
    private Button botaoMesa3;
    private Button botaoMesa4;
    private Button botaoMesa5;
    private Button botaoMesa6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesas);

        botaoMesa1 = findViewById(R.id.botaoMesa1);
        botaoMesa2 = findViewById(R.id.botaoMesa2);
        botaoMesa3 = findViewById(R.id.botaoMesa3);
        botaoMesa4 = findViewById(R.id.botaoMesa4);
        botaoMesa5 = findViewById(R.id.botaoMesa5);
        botaoMesa6 = findViewById(R.id.botaoMesa6);

        setTitle("Escolha a mesa");

        botaoMesa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mesa Disponivel",Toast.LENGTH_SHORT).show();
            }
        });

        botaoMesa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mesa Disponivel",Toast.LENGTH_SHORT).show();
            }
        });

        botaoMesa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mesa Disponivel",Toast.LENGTH_SHORT).show();
            }
        });

        botaoMesa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mesa Disponivel",Toast.LENGTH_SHORT).show();
            }
        });

        botaoMesa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mesa Indisponivel",Toast.LENGTH_SHORT).show();
            }
        });

        botaoMesa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mesa Indisponivel",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
