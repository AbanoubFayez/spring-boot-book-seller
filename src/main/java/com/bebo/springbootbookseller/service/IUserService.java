package com.bebo.springbootbookseller.service;

import com.bebo.springbootbookseller.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findUserByUserName(String username);

    void makeAdmin(String username);
}
