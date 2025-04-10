package com.psavi.core.repository.user;

import com.psavi.core.entity.User;
import com.psavi.core.repository.repositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepositoryInterface extends repositoryInterface<User, String> {

}
