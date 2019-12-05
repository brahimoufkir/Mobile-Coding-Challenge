package com.unitedremote.mobilecodingchallenge.api;

import com.unitedremote.mobilecodingchallenge.model.RepositoryResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface RepoApiService {

    @GET("/search/repositories")
    Call<RepositoryResponse> getRepositoryList(@QueryMap() Map<String,String> filter );


}
