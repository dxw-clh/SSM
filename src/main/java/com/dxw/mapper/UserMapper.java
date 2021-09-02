package com.dxw.mapper;

import com.dxw.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getUserList();
}
