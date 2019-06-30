package com.android.rumahsakitsemen.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.android.rumahsakitsemen.R;

public class MainActivity extends AppCompatActivity {
    LinearLayout registrasi;
    LinearLayout daftarPoli;
    LinearLayout melihatAntrian;
    LinearLayout pengumuman;
    LinearLayout cs;
    LinearLayout profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrasi = (LinearLayout)findViewById(R.id.daftar_layanan);
        daftarPoli = (LinearLayout)findViewById(R.id.daftar_poli);
        melihatAntrian = (LinearLayout)findViewById(R.id.melihatAntrian);
        pengumuman = (LinearLayout)findViewById(R.id.pengumuman);
        cs = (LinearLayout)findViewById(R.id.cs);
        profil = (LinearLayout)findViewById(R.id.profil);

        registrasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, RegistrasiActivity.class);
                startActivity(intent);
            }
        });

        daftarPoli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DaftarPoliActivity.class);
                startActivity(intent);
            }
        });

        melihatAntrian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MelihatAntrianActivity.class);
                startActivity(intent);
            }
        });

        pengumuman.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, PengumumanActivity.class);
                startActivity(intent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        profil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}

