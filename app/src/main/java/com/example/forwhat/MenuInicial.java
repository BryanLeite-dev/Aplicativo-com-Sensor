package com.example.forwhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MenuInicial extends AppCompatActivity {
    Button btnJogar, btnInfo;
    TextView txtGit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);

        btnInfo = findViewById(R.id.btnInfo);
        btnJogar = findViewById(R.id.btnJogar);
        txtGit = findViewById(R.id.txtGit);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuInicial.this, Local.class);
                startActivity(intent);
            }
        });
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuInicial.this, Foguete.class);
                startActivity(intent);
            }
        });
        txtGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/BryanLeite-dev"));
                startActivity(intent);
            }
        });
    }
}