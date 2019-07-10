package com.example.starter.view.utils;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class AlertUtils {
    public static void showAlert(String message, AppCompatActivity activity) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();

    }

    public static void showLoadingDialog(AppCompatActivity activity) {
        Toast.makeText(activity, "Carregando", Toast.LENGTH_SHORT).show();
    }

    public static void hideLoadingDialog(AppCompatActivity activity) {

    }
}