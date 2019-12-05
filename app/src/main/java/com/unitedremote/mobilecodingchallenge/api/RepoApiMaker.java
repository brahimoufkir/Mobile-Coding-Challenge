package com.unitedremote.mobilecodingchallenge.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RepoApiMaker {

    private static final String BASE_URL = "http://api.github.com";

    private Retrofit retrofit;

    public RepoApiMaker() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RepoApiService getService() {

        return retrofit.create(RepoApiService.class);
    }
}
