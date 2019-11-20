package com.vinyl.service;

import com.vinyl.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
