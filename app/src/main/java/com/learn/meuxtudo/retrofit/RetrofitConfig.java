package com.learn.meuxtudo.retrofit;

import com.learn.meuxtudo.service.ILancheService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;
    private String baseURL = "http://10.0.2.2:8080/api/";

    public RetrofitConfig(){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public ILancheService getLancheService(){
        return this.retrofit.create(ILancheService.class);
    }

}
