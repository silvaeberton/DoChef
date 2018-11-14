package com.example.beto.restaurantedochef;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLogin extends AppCompatActivity {

    private Button botaologin;
    private Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botaologin = findViewById(R.id.botaoLogar);
        botaoCadastro = findViewById(R.id.botaoCadastro);

        botaologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this,Principal.class);
                startActivity(intent);
            }
        });

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this,ActivityCadastrar.class);
                startActivity(intent);
            }
        });
    }
}
