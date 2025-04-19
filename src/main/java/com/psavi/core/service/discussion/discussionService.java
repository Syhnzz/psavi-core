package com.psavi.core.service.discussion;

import com.psavi.core.entity.Discussion;
import com.psavi.core.entity.User;
import com.psavi.core.repository.discussion.discussionRepositoryInterface;
import com.psavi.core.service.serviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class discussionService implements serviceInterface<Discussion, Integer> {

    @Autowired
    private discussionRepositoryInterface discussionRepository;

    public Discussion create(Discussion discussion) {
        return discussionRepository.save(discussion);
    }

    public Iterable<Discussion> getAll() {
        return discussionRepository.findAll();
    }

    public Discussion getById(Integer id) {
        Optional<Discussion> discussion = discussionRepository.findById(id);
        return discussion.orElse(null);
    }

}
