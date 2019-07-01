package com.springboot.project_1.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User findBynameAndPassword(String username,String password);
}
