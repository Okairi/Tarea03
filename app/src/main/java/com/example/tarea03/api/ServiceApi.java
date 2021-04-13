package com.example.tarea03.api;

import com.example.tarea03.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServiceApi {

@GET("posts")
public abstract Call<List<User>> listaUsuario();



}

