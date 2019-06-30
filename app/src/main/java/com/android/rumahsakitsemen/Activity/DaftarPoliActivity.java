package com.android.rumahsakitsemen.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.android.rumahsakitsemen.R;

public class DaftarPoliActivity extends AppCompatActivity {
    LinearLayout poli = findViewById(R.id.poli);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_poli);
        poli = (LinearLayout) findViewById(R.id.poli);

        poli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DaftarPoliActivity.this, PemilihanHariActivity.class);
                startActivity(intent);
            }
        });
    }
}
