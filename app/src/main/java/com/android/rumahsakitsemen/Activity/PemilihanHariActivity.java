package com.android.rumahsakitsemen.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.android.rumahsakitsemen.R;

public class PemilihanHariActivity extends AppCompatActivity {
    LinearLayout senin = findViewById(R.id.senin);
    LinearLayout selasa = findViewById(R.id.selasa);
    LinearLayout rabu = findViewById(R.id.rabu);
    LinearLayout kamis= findViewById(R.id.kamis);
    LinearLayout jumat = findViewById(R.id.jumat);
    LinearLayout sabtu = findViewById(R.id.sabtu);
    LinearLayout minggu = findViewById(R.id.minggu);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemilihan_hari);
        senin = (LinearLayout)findViewById(R.id.senin);
        selasa = (LinearLayout) findViewById(R.id.selasa);
        rabu = (LinearLayout) findViewById(R.id.rabu);
        kamis = (LinearLayout) findViewById(R.id.kamis);
        jumat = (LinearLayout) findViewById(R.id.jumat);
        sabtu = (LinearLayout) findViewById(R.id.sabtu);
        minggu = (LinearLayout) findViewById(R.id.minggu);

        senin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });

        selasa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });

        rabu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });

        kamis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });

        jumat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });

        sabtu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });

        minggu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanHariActivity.this, PemilihanDokterActivity.class);
                startActivity(intent);
            }
        });
    }
}
