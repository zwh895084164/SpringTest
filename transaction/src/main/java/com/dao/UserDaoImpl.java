package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    @Qualifier("jdbc")
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addMoney() {
        String sql="update zwh_user set money=money+? where user_id=?";
        jdbcTemplate.update(sql,"10","007");
    }

    @Override
    public void reduceMoney() {
        String sql="update zwh_user set money=money-? where user_id=?";
        jdbcTemplate.update(sql,"10","008");
    }
}
