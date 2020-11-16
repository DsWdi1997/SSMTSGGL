package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.User;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User queryUser(User user) {
        return userDao.queryUser(user);
    }

}
