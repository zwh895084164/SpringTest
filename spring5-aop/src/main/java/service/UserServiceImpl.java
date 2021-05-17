package service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("执行方法add");
    }
}
