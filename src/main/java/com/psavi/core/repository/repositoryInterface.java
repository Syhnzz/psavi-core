package com.psavi.core.repository;

import com.psavi.core.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface repositoryInterface extends CrudRepository<User, String> {
}
