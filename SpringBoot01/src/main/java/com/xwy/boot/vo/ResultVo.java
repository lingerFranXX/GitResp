package com.xwy.boot.vo;

import lombok.Data;

@Data
public class ResultVo {
    private Integer code;

    private String msg;
    private Object data;
}
