package com.springboot.project_1.service;

import com.springboot.project_1.dao.PulicInfoMapper;
import com.springboot.project_1.entity.PublicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublicInfoService {
    @Autowired
    PulicInfoMapper pulicInfoMapper;
    public List<PublicInfo> getPublicInfo(){
        return pulicInfoMapper.getInfo();
    }
    public PublicInfo insertPublicInfo(PublicInfo model){
        return pulicInfoMapper.insertInfo(model);
    }
}
