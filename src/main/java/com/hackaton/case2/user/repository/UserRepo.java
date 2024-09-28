package com.hackaton.case2.user.repository;

import com.hackaton.case2.common.UUIDTypeHandler;
import com.hackaton.case2.user.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.LongTypeHandler;

import java.util.UUID;


@Mapper
public interface UserRepo {

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Insert("""
                        INSERT INTO users(email,firstname,lastname,patronymic,password)
                        VALUES(#{email}, #{firstname}, #{lastname}, #{patronymic}, #{password})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
}

