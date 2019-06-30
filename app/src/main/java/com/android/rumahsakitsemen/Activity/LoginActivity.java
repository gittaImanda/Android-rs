package com.android.rumahsakitsemen.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.rumahsakitsemen.R;
import com.google.firebase.iid.FirebaseInstanceId;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_login;
    private EditText edt_nik, edt_password;
    private TextView daftar;
    private Context mContext;
    //private PrefManager mPref;
    //private BaseApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        mContext = this;
        //mPref        = new PrefManager(mContext);
        //mApiService  = UtilApi.getAPIService();
        btn_login = (Button) findViewById(R.id.btnLogin);
        edt_nik = (EditText) findViewById(R.id.editNik);
        edt_password = (EditText) findViewById(R.id.editPassword);
        daftar = (TextView) findViewById(R.id.daftar);
        btn_login.setOnClickListener(this);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(intent);

            }
        });
    }
       /* if (mPref.isLoggedIn()){
            startActivity(new Intent(mContext, MainActivity.class));

            finish();
        }
    }

    private void onLogin(){

        String deviceToken = FirebaseInstanceId.getInstance().getToken();

        mApiService.user_login(
                edt_nik.getText().toString(),edt_password.getText().toString(), deviceToken)
                .enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if (response.isSuccessful()){
                            mPref.makeLogin(response.body());
                            startActivity(new Intent(mContext, MainActivity.class));
                            finish();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {

                    }
                });
    }*/


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin: {

            }
            break;
            case R.id.btnDaftar:
        }
    }
}
