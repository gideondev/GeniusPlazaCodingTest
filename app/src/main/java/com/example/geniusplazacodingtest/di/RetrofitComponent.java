package com.example.geniusplazacodingtest.di;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = RetrofitModule.class)
public interface RetrofitComponent {
    Retrofit getRetrofit();
}
