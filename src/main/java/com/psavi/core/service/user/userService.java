package com.psavi.core.service.user;

import com.psavi.core.entity.User;
import com.psavi.core.repository.user.userRepositoryInterface;
import com.psavi.core.service.serviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userService implements serviceInterface<User, Integer> {

    @Autowired
    private userRepositoryInterface userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

}
