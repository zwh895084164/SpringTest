package com.dao;

import com.entity.ZwhUser;
import org.springframework.stereotype.Repository;


public interface BookDao {
     void addUser(ZwhUser zwhUser);
     ZwhUser get(String id);
}
