package com.service;

import com.dao.BookDao;
import com.entity.ZwhUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    public BookDao bookDao;

    public void add(ZwhUser zwhUser) {
        bookDao.addUser(zwhUser);
    }
    public ZwhUser get(String id) {
        return bookDao.get(id);
    }
}
