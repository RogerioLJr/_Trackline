package com.example.negrao.com.trackline_v01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Gilgamesh on 11/05/2016.
 */

public class Item extends AppCompatActivity {

    Button bt_locatario, bt_funcoes;

    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    bt_locatario = (Button)findViewById(R.id.button);
    botao_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent1 = new Intent(MainActivity.this, Bem_vindo.class);
            startActivity(intent1);
        }
    });
}
