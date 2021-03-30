package com.lucaswangdev.mapper;

import com.lucaswangdev.entiry.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
