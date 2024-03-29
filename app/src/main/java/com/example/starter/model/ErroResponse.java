package com.example.starter.model;


import java.io.Serializable;

public class ErroResponse implements Serializable {

    private String timestamp;
    private String status;
    private String error;
    private String exception;
    private String message;
    private String path;
    private int internalErrorCode;

    public ErroResponse(String message) {
        this.message = message;
    }

    public ErroResponse() {
    }

    public ErroResponse(String message, int internalErrorCode) {
        this.message = message;
        this.internalErrorCode = internalErrorCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getInternalErrorCode() {
        return internalErrorCode;
    }

    public void setInternalErrorCode(int internalErrorCode) {
        this.internalErrorCode = internalErrorCode;
    }

}