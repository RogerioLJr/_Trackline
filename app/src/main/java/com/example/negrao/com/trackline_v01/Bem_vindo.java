package com.example.negrao.com.trackline_v01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Gilgamesh on 11/05/2016.
 */
public class Bem_vindo extends AppCompatActivity {

    Button bt_locatario, bt_funcoes;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_funcoes = (Button)findViewById(R.id.button3);
        bt_locatario = (Button)findViewById(R.id.button2);
        bt_locatario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Bem_vindo.this, Lista_Locatarios.class);
                startActivity(intent2);
            }
        });
    }

