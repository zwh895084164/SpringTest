package com.dao;


import com.entity.ZwhUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    @Qualifier("jdbc")
    public JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(ZwhUser zwhUser) {
        String sql="insert into zwh_user(name,pass,sex,user_id) values(?,?,?,?)";
        jdbcTemplate.update(sql,zwhUser.getName(),zwhUser.getPass(),zwhUser.getSex(),zwhUser.getUserId());
    }

    @Override
    public ZwhUser get(String id) {
        String sql="select * from zwh_user where user_id=?";
        ZwhUser zwhUser=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<ZwhUser>(ZwhUser.class),id);
        return zwhUser;
    }
}
