package com.zpi.printerhub;

import com.zpi.printerhub.entities.User;
import com.zpi.printerhub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
