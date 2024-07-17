package com.example.appsenac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//CN
        // atribuiu o elemento(botao) a objeto = identificar e localiza o elemento(botao) pelo ID na view
        Button btnCN = findViewById(R.id.btnCN);

        //objeto botão seta - configura o click nele
        btnCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //oque ele ira fazer ao clicar nele
                Intent telaCH = new Intent(getApplicationContext(), CH_Activity.class);
                startActivity(telaCH);
            }
        });
//COMPUTARIA
        Button btnTecnico = findViewById(R.id.btnTecnico);
        btnTecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaTecnico = new Intent(getApplicationContext(), Tec_Activity.class);
                startActivity(telaTecnico);
            }
        });
//LINGUAGENS
        Button btnLinguagens = findViewById(R.id.btnLinguagens);
        btnLinguagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLinguagens = new Intent(getApplicationContext(), LinguagensActivity.class);
                startActivity(telaLinguagens);
            }
        });
//MATEMATICA
        Button btnMatematica = findViewById(R.id.btnMatematica);
        btnMatematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMat = new Intent(getApplicationContext(), MatematicaActivity.class);
                startActivity(telaMat);
            }
        });
//PP
        Button btnPP = findViewById(R.id.btnpp);
        btnPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telapp = new Intent(getApplicationContext(), PP_Activity.class);
                startActivity(telapp);
            }
        });
//PV
        Button btnPv = findViewById(R.id.btnPv);
        btnPv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telapv = new Intent(getApplicationContext(), PV_Activity.class);
                startActivity(telapv);
            }
        });
//CH
        Button btnCh = findViewById(R.id.btnCh);
        btnCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telach = new Intent(getApplicationContext(), CH_Activity.class);
                startActivity(telach);
            }
        });

    }
}