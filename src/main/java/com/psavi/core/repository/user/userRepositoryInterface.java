package com.psavi.core.repository.user;

import com.psavi.core.entity.User;
import com.psavi.core.repository.repositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepositoryInterface extends repositoryInterface<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
}
