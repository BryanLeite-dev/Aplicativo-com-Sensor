package com.example.forwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Lancou extends AppCompatActivity {
    Button btnVoltar;
    ImageView imgMoon2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancou);

        btnVoltar = findViewById(R.id.btnVoltar3);
        imgMoon2 = findViewById(R.id.imgMoon2);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lancou.this, MenuInicial.class);
                startActivity(intent);
            }
        });

        imgMoon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lancou.this, Video.class);
                startActivity(intent);
            }
        });
    }
}