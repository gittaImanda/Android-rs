package com.android.rumahsakitsemen.ApiConfig;

public class UtilApi {
    public static final String BASE_URL_API = "http://192.168.43.14/rumah-sakit-2public/api/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}

