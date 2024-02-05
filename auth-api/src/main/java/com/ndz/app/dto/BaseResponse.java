package com.ndz.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/*
    author: NMDuc
    created_at: 1/2/2024
    github: https://github.com/NDZwei
*/
@Getter
@Setter
@NoArgsConstructor
public class BaseResponse implements Serializable {
    private Integer status;
    private String message;
    private Object data;
}
