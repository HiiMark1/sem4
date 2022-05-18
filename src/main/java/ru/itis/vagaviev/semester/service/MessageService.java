package ru.itis.vagaviev.semester.service;

import ru.itis.vagaviev.semester.dto.MessageDto;

import java.util.List;

public interface MessageService {
    List<MessageDto> getAllMessages();
}
