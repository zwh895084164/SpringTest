package com.wz.dao;

import com.wz.pojo.ZwhUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZwhUserMapperImpl3 extends BaseDao implements ZwhUserDao {
    @Override
    public List<ZwhUser> getZwhUserList() {
        System.out.println("ZwhUserMapperImpl3=====");
        return getSqlSession().getMapper(ZwhUserDao.class).getZwhUserList();
    }
}
