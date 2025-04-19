package com.psavi.core.repository.message;

import com.psavi.core.entity.Message;
import com.psavi.core.repository.repositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public interface messageRepositoryInterface extends repositoryInterface<Message, Integer> {
}
