package com.example.beto.restaurantedochef;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCadastrar extends AppCompatActivity {

    private Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        botaoCadastro = findViewById(R.id.botaoCadastrar);

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCadastrar.this,Principal.class);
                startActivity(intent);
            }
        });
    }
}
