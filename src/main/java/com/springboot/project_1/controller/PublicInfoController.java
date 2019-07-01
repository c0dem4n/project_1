package com.springboot.project_1.controller;

import com.springboot.project_1.entity.PublicInfo;
import com.springboot.project_1.service.PublicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicInfoController {
    @Autowired
    PublicInfoService publicInfoService;

    @RequestMapping("/hello")
    public List<PublicInfo> hello(){
        return publicInfoService.getPublicInfo();
}
    @RequestMapping("/121")
    public PublicInfo insertPublicInfo(PublicInfo model){
        return publicInfoService.insertPublicInfo(model);
    }
}
