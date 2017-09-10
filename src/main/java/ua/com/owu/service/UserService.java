package ua.com.owu.service;

import ua.com.owu.entity.User;

import java.util.List;

/**
 * Created by User on 30.08.2017.
 */
public interface UserService {
    void save(String name);
    void save(User user);
    User findOne(int id);
    List<User> findAll();
}
