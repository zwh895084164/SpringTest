package com.wz.dao;

import com.wz.pojo.ZwhUser;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZwhUserMapperImpl2 extends SqlSessionDaoSupport implements ZwhUserDao {
    /*
    mybatis-spring 1.2.0之后，继承SqlSessionDaoSupport的DAO类，他们的对象不能被自动注入
    SqlSessionFactory 或SqlSessionTemplate对象,一种方法是覆盖setSqlSessionFactory方法并加上自动注入，另一种
    是写个DAO基类继承SqlSessionDaoSupport，在基类中实现这个操作
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    */
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<ZwhUser> getZwhUserList() {

        return getSqlSession().getMapper(ZwhUserDao.class).getZwhUserList();
    }
}
