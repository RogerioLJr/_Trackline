package com.example.negrao.com.trackline_v01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Gilgamesh on 11/05/2016.
 */
public class Amostra_Locatario extends AppCompatActivity {

    Button bt_pesquisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_pesquisa = (Button)findViewById(R.id.button);
        bt_pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Lista_Locatarios.this, Amostra_Locatario.class);
                startActivity(intent5);
            }
        });

    }

}