package com.webUser.web.service;

import com.webUser.web.model.User;

import java.util.List;

public interface UserService {

    Object findById(Long id);

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);
}
