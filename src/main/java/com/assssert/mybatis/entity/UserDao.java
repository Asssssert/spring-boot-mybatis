package com.assssert.mybatis.entity;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from user where id=${id}")
    User getAllUser(@Param("id") int id);
}
