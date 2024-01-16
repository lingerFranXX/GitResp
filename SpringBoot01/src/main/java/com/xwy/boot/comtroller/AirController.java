package com.xwy.boot.comtroller;

import com.xwy.boot.entity.District;
import com.xwy.boot.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AirController {

    @Autowired
    private AirService airService;

}
