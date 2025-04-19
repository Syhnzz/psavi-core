package com.psavi.core.service.message;

import com.psavi.core.entity.Message;
import com.psavi.core.entity.User;
import com.psavi.core.repository.message.messageRepositoryInterface;
import com.psavi.core.service.serviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class messageService implements serviceInterface<Message, Integer> {

    @Autowired
    private messageRepositoryInterface messageRepository;

    public Message create(Message message) {
        return messageRepository.save(message);
    }

    public Iterable<Message> getAll() {
        return messageRepository.findAll();
    }

    public Message getById(Integer id) {
        Optional<Message> message = messageRepository.findById(id);
        return message.orElse(null);
    }

}
