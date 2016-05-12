package com.example.negrao.com.trackline_v01;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

/**
 * Created by Gilgamesh on 11/05/2016.
 */
public class Lista_Itens extends AppCompatActivity {

    ImageButton bt_pesquisa;
    ListView lista_itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_itens = (ListView)findViewById(R.id.listView);

        lista_itens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Lista_Itens.this, Item.class);
                startActivity(intent4);
            }
        });

        bt_pesquisa = (ImageButton)findViewById(R.id.imageButton);
        bt_pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Lista_Itens.this, Item.class);
                startActivity(intent4);
            }
        });

    }

}
