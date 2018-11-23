package com.ziyata.pancasila;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPengertian(View view) {
        Intent pindah = new Intent(this, PengertianActivity.class);
        startActivity(pindah);
    }

    public void btnSimbol(View view) {
        Intent pindah = new Intent(this, PengertianSimbolSimbolActivity.class);
        startActivity(pindah);
    }

    public void btnTujuan(View view) {
        Intent pindah = new Intent(this, TujuanActivity.class);
        startActivity(pindah);
    }

    public void btnIsiPancasila(View view) {
        Intent pindah = new Intent(this, IsiPancasilaActivity.class);
        startActivity(pindah);
    }
}
