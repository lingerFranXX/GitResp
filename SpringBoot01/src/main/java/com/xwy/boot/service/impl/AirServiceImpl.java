package com.xwy.boot.service.impl;

import com.xwy.boot.entity.District;
import com.xwy.boot.mapper.AirMapper;
import com.xwy.boot.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirServiceImpl implements AirService {

    @Autowired
    private AirMapper mapper;


}
