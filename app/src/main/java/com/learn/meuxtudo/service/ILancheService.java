package com.learn.meuxtudo.service;

import com.learn.meuxtudo.model.Lanche;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ILancheService {

    @GET("lanche/")
    Call<Lanche[]> getAll();

}
