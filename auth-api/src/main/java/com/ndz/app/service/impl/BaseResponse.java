package com.ndz.app.service.impl;

import org.springframework.http.HttpStatus;

/*
    author: NMDuc
    created_at: 2/1/2024
    github: https://github.com/NDZwei
*/
public abstract class BaseResponse {
    protected com.ndz.app.dto.BaseResponse getResponse200(String message) {
        com.ndz.app.dto.BaseResponse rs = new com.ndz.app.dto.BaseResponse();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage(message);
        return rs;
    }

    protected com.ndz.app.dto.BaseResponse getResponse200(Object data) {
        com.ndz.app.dto.BaseResponse rs = new com.ndz.app.dto.BaseResponse();
        rs.setStatus(HttpStatus.OK.value());
        rs.setMessage("Success");
        rs.setData(data);
        return rs;
    }

    protected com.ndz.app.dto.BaseResponse getResponse400() {
        com.ndz.app.dto.BaseResponse rs = new com.ndz.app.dto.BaseResponse();
        rs.setStatus(HttpStatus.BAD_REQUEST.value());
        rs.setMessage(HttpStatus.BAD_REQUEST.name());
        return rs;
    }

    protected com.ndz.app.dto.BaseResponse getResponse500() {
        com.ndz.app.dto.BaseResponse rs = new com.ndz.app.dto.BaseResponse();
        rs.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        rs.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.name());
        return rs;
    }

    protected com.ndz.app.dto.BaseResponse getResponse500(String message) {
        com.ndz.app.dto.BaseResponse rs = new com.ndz.app.dto.BaseResponse();
        rs.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        rs.setMessage(message);
        return rs;
    }
}
