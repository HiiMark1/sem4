package ru.itis.vagaviev.semester.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.vagaviev.semester.dto.MessageDto;
import ru.itis.vagaviev.semester.repository.MessageRepository;
import ru.itis.vagaviev.semester.service.MessageService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<MessageDto> getAllMessages() {
        return messageRepository.findAll().stream().map(MessageDto::formModel).collect(Collectors.toList());
    }
}
