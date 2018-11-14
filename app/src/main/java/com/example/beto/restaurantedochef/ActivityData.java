package com.example.beto.restaurantedochef;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class ActivityData extends AppCompatActivity {

    private Button botaodata;
    CalendarView calendario;
    String dataSelecionada;
    int ano;
    int mes;
    int dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        setTitle("Selecione a data");

        calendario = findViewById(R.id.calendarView);
        calendario.setMinDate(System.currentTimeMillis());
        botaodata = findViewById(R.id.botaoselecionadata);

        final long milisegundos = System.currentTimeMillis();
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                ano = year;
                mes = month;
                dia = dayOfMonth;

                Toast.makeText(getApplicationContext(), sdf.format(milisegundos), Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(),dia + "/" + (mes + 1) + "/" + ano,Toast.LENGTH_SHORT).show();
            }
        });

        botaodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityData.this,ActivityMesas.class);
                startActivity(intent);
            }
        });

    }
}
