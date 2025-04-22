package com.psavi.core.repository.discussion;

import com.psavi.core.entity.Discussion;
import com.psavi.core.repository.repositoryInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface discussionRepositoryInterface extends repositoryInterface<Discussion, Integer> {
    Page<Discussion> findAll(Pageable pageable);
}
