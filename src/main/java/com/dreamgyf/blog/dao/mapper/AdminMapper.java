package com.dreamgyf.blog.dao.mapper;

import com.dreamgyf.blog.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {

    Admin selectAllByUsername(@Param("username") String username);
}
