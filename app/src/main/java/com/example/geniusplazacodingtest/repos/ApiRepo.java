package com.example.geniusplazacodingtest.repos;

import com.example.geniusplazacodingtest.api.ApiCallInterface;
import com.example.geniusplazacodingtest.di.ApiCallInterfaceComponent;
import com.example.geniusplazacodingtest.di.DaggerApiCallInterfaceComponent;
import com.example.geniusplazacodingtest.models.JsonResponse;


import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiRepo {


    ApiCallInterfaceComponent apiCallInterfaceComponent;
    ApiCallInterface service;

    Observable<JsonResponse> jsonResponseObservable;

    //Constructor
    public ApiRepo() {
        //DI
        apiCallInterfaceComponent = DaggerApiCallInterfaceComponent.create();
        service = apiCallInterfaceComponent.getApiCallInterface();
        jsonResponseObservable = service.getData().subscribeOn(Schedulers.io());

    }

    //Getters
    public Observable<JsonResponse> getJsonResponseObservable(){
            return jsonResponseObservable;
    }

}
