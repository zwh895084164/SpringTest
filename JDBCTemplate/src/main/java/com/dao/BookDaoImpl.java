package com.dao;


import com.entity.ZwhUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(ZwhUser zwhUser) {
        String sql="insert into zwh_user(name,pass,sex,user_id) values(?,?,?,?)";
        jdbcTemplate.update(sql,zwhUser.getName(),zwhUser.getPass(),zwhUser.getSex(),zwhUser.getUserId());
    }
}
