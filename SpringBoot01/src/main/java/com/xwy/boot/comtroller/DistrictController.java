package com.xwy.boot.comtroller;

import com.xwy.boot.entity.District;
import com.xwy.boot.service.DistrictService;
import com.xwy.boot.util.R;
import com.xwy.boot.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    /**
     * # 查询区域信息
     * # 请求方式&请求路径
     * GET	http://localhost:8080/district/list
     *
     * # 请求参数
     * 无
     *
     * # 业务流程
     * 直接查询库中的district表中全部数据
     *
     * # 响应数据
     * 成功响应：
     * {
     *   "code": 0,
     *   "msg": "",
     *   "data": [
     *     {"id": 1,"name": "西城区"},
     *     {"id": 2,"name": "东城区"},
     *     …………
     *   ]
     * }
     * 失败响应：
     * {
     *   "code": 错误编码,
     *   "msg": "错误信息",
     *   "data": null
     * }
     */

    @GetMapping("/district/list")
    private ResultVo allDistrict(){
        List<District> list = districtService.findAllDistrict();
        return R.success(list);
    }
}
