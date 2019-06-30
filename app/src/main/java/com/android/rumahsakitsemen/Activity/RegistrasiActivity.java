package com.android.rumahsakitsemen.Activity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.rumahsakitsemen.R;

import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrasiActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_nama, edt_password, edt_nik, edt_tpt_lahir, edt_telepon;
    private TextView tgl_lahir, jns_kelamin;
    private Button btn_register;
    private String kodeJK = "";
   // private BaseApiService mApiService;
    private Context mContext;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private RadioGroup radio_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        init();
    }

    private void init(){
        mContext = this;
        //mApiService     = UtilApi.getAPIService();
        edt_nama        = (EditText) findViewById(R.id.editName);
        edt_password    = (EditText) findViewById(R.id.editPassword);
        edt_nik         = (EditText) findViewById(R.id.editNik);
        edt_tpt_lahir   = (EditText) findViewById(R.id.editTempatLhr);
        tgl_lahir       = (TextView) findViewById(R.id.tglLhr);
        jns_kelamin     = (TextView) findViewById(R.id.jnsKelamin);
        edt_telepon     = (EditText) findViewById(R.id.editNoTelp);


        radio_g         = (RadioGroup) findViewById(R.id.radiogroup);
        btn_register    = (Button) findViewById(R.id.btnRegister);
        btn_register.setOnClickListener(this);

        //datepicker tgl_lahir
        tgl_lahir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        RegistrasiActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day){
                month = month + 1;
                Log.d("RegistrasiActivity", "onDateSet: dd/mm/yyyy: " + day + "/" + month + "/" + year);

                String date = year + "-" + month + "-" + day;
                tgl_lahir.setText(date);
            }
        };

        //RadioButtonJenisKelamin
        radio_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.klmnL){
                    //jns_kelamin.setText("Laki-laki");
                    kodeJK = "L";
                }else if (i == R.id.klmnP){
                    //jns_kelamin.setText("Perempuan");
                    kodeJK = "P";
                }
            }
        });
    }

   /* private void onRegister(){

        mApiService     = UtilApi.getAPIService();
        mApiService.user_register(
                edt_nama.getText().toString(), edt_password.getText().toString(), edt_nik.getText().toString(),
                edt_tpt_lahir.getText().toString(), tgl_lahir.getText().toString(),
                edt_telepon.getText().toString(), kodeJK)
                .enqueue(new Callback<RegistResponse>() {
                    @Override
                    public void onResponse(Call<RegistResponse> call, Response<RegistResponse> response) {
                        Log.e("Data", "data : Proses");
                        if (response.isSuccessful()){
                            Log.e("Data", "data : Sukses");
                            if(response.body().getStatus().equals("OK"))
                                finish();
                            else
                                Toast.makeText(mContext,"GAGAL", Toast.LENGTH_SHORT).show();
                        }else {
                            Log.e("Data", "data : Gagal");
                        }
                    }

                    @Override
                    public void onFailure(Call<RegistResponse> call, Throwable t) {
                        Log.e("Data", "data : "+t);
                    }
                });
    }*/

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnRegister:{
               // onRegister();
            }
        }
    }
}
