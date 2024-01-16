package com.xwy.boot.mapper;

import com.xwy.boot.entity.District;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DistrictMapper {

    @Select("SELECT * FROM district")
    List<District> findAllDistrict();
}
