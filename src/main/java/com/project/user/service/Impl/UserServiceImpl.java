package com.project.user.service.Impl;

import com.project.user.entities.User;
import com.project.user.respository.UserRepository;
import com.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        System.out.println("HERE");
        return userRepository.save(user);
    }
}
