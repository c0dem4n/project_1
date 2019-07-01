package com.springboot.project_1.dao;

import com.springboot.project_1.entity.PublicInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PulicInfoMapper {
    public List<PublicInfo> getInfo();
    public PublicInfo insertInfo(PublicInfo model);
}
