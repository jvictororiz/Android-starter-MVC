package com.example.starter.view.controller;

import com.example.starter.service.Response.ResponseTest;
import com.example.starter.service.config.Api;
import com.example.starter.view.interfaces.OnCallbackCompletedListener;

import java.util.List;

public class RepositoryController {
    private static final String ORDER_DEFAULT = "asc";

//    public static void findPullRequestByRpository(String query, OnCallbackCompletedListener<List<ResponseTest>> callback) {
//        Api.repositoryService().findPullRequestByRepository(getLogin(query), getRepositoryName(query), ORDER_DEFAULT).enqueue(callback);
//    }
//
//    public static void findIssuesByRepository(String query, final OnCallbackCompletedListener<List<ResponseTest>> callback) {
//        Api.repositoryService().findIssuesByRepository(getLogin(query), getRepositoryName(query), ORDER_DEFAULT).enqueue(callback);
//    }

    private static String getLogin(String query) {
        int positionDivision = query.indexOf("/");
        return query.substring(0, positionDivision);
    }

    private static String getRepositoryName(String query) {
        int positionDivision = query.indexOf("/");
        return query.substring(positionDivision + 1);
    }
}