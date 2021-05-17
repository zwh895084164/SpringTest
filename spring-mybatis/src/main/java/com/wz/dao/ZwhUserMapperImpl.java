package com.wz.dao;

import com.wz.pojo.ZwhUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZwhUserMapperImpl implements ZwhUserDao{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<ZwhUser> getZwhUserList() {
        ZwhUserDao zwhUserDao=sqlSession.getMapper(ZwhUserDao.class);
        return zwhUserDao.getZwhUserList();
    }
}

