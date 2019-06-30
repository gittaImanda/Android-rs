package com.android.rumahsakitsemen.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.rumahsakitsemen.R;

public class PemilihanDokterActivity extends AppCompatActivity {
    LinearLayout dokter = findViewById(R.id.dokter);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemilihan_dokter);
        dokter = (LinearLayout) findViewById(R.id.dokter);

        dokter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PemilihanDokterActivity.this, DaftarPasienRM.class);
                startActivity(intent);
            }
        });
    }
}
