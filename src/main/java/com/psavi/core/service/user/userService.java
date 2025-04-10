package com.psavi.core.service.user;

import com.psavi.core.entity.User;
import com.psavi.core.repository.user.userRepositoryInterface;
import com.psavi.core.service.serviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService implements serviceInterface<User, String> {

    @Autowired
    private userRepositoryInterface repository;

    public User create(User user){
        return repository.save(user);
    }

    public Iterable<User> getAll() {
        return repository.findAll();
    }
}
