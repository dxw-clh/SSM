package com.dxw.mapper;

import com.dxw.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//方法一：
//      继承SqlSessionDaoSupport，这样就可以直接使用sqlSessionTemplate
//      在配置文件中需要配置这个类的bean，注入SqlSessionFactory的bean
//public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
//    @Override
//    public List<User> getUserList() {
//        return getSqlSessionTemplate().getMapper(UserMapper.class).getUserList();
//    }
//}

//方法二：继承SqlSessionDaoSupport，这样就可以直接使用sqlSessionTemplate
//public class UserMapperImpl implements UserMapper{
//
//    private SqlSessionTemplate sqlSessionTemplate;
//
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        this.sqlSessionTemplate = sqlSessionTemplate;
//    }
//
//    @Override
//    public List<User> getUserList() {
//        return sqlSessionTemplate.getMapper(UserMapper.class).getUserList();
//    }
//}

