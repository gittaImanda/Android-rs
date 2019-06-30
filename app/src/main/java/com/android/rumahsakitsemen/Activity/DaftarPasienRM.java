package com.android.rumahsakitsemen.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.android.rumahsakitsemen.R;

import java.time.chrono.Chronology;

public class DaftarPasienRM extends AppCompatActivity {
    private EditText pasien;
    private Button rm;


    pasien =(EditText)

    findViewById(R.id.pasien);

    rm =(Button)

    findViewById(R.id.rm);
    rm.setOnClickListener(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pasien_rm);
        pasien = (LinearLayout) findViewById(R.id.dokter);

        pasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarPasienRM.this, DetailAntrianActivity.class);
                startActivity(intent);
            }
        });

        @Override
        public void onClick (View view){
            switch (view.getId()) {
                case R.id.btnRegister: {
                }
            }
        }
    }
}

