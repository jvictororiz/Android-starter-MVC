package com.example.starter.service.config;

import com.example.starter.service.interfaces.RepositoryService;

public class Api {

    public static RepositoryService repositoryService() {
        return RetrofitConfig.getRetrofit().create(RepositoryService.class);
    }
}