package com.manyin.vhr.mapper;

import com.manyin.vhr.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface IUserMapper {
    @Select("select * from user_info")
    List<UserInfoEntity> getAll();
}
