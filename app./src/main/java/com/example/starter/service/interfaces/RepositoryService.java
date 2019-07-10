package com.example.starter.service.interfaces;

import com.example.starter.service.Response.ResponseTest;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RepositoryService {

    @GET("repos/{login}/{nameRep}/pulls")
    Call<List<ResponseTest>> findPullRequestByRepository(@Path("login") String login, @Path("nameRep") String name, @Query("direction") String direction);

    @GET("repos/{login}/{nameRep}/issues")
    Call<List<ResponseTest>> findIssuesByRepository(@Path("login") String login, @Path("nameRep") String name, @Query("direction") String direction);
}