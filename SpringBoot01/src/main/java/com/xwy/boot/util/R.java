package com.xwy.boot.util;

import com.xwy.boot.vo.ResultVo;

public class R {

    public static ResultVo success(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("");
        return resultVo;
    }

    public static ResultVo success(Object obj){
        ResultVo resultVo = success();
        resultVo.setData(obj);
        return resultVo;
    }
}
