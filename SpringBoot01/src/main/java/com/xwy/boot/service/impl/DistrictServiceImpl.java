package com.xwy.boot.service.impl;

import com.xwy.boot.entity.District;
import com.xwy.boot.mapper.DistrictMapper;
import com.xwy.boot.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictMapper mapper;

    @Override
    public List<District> findAllDistrict() {
        return mapper.findAllDistrict();
    }
}
