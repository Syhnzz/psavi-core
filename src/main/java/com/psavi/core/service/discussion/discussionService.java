package com.psavi.core.service.discussion;

import com.psavi.core.entity.Discussion;
import com.psavi.core.repository.discussion.discussionRepositoryInterface;
import com.psavi.core.service.serviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    public Page<Discussion> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return discussionRepository.findAll(pageable);
    }

    public boolean deleteIfOwner(Integer id) {
        Optional<Discussion> optional = discussionRepository.findById(id);

        Discussion discussion = optional.get();

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }

        if (discussion.getAuteur().getUsername().equals(username)) {
            discussionRepository.delete(discussion);
            return true;
        }

        return false;
    }

}
