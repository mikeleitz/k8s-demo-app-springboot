package com.mikeleitz.blog.k8s.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author leitz
 */
@RestController()
@RequestMapping("/message")
public class MessageController {
    private Logger _logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired MessageRepository _messageRepository;

    @GetMapping("")
    public List<Message> getMessages() {
        List<Message> returnValue = new ArrayList<>();

        _messageRepository.findAll().forEach(m -> returnValue.add((Message) m));

        return returnValue;
    }

    @GetMapping("{id}")
    public Optional<Message> getMessage(@PathVariable Long id) {
        Optional<Message> returnValue = null;

        returnValue = _messageRepository.findById(id);

        return returnValue;
    }

    @PostMapping("")
    public void addMessage(@RequestBody Message message) {
        _messageRepository.save(message);
    }

    @DeleteMapping("{id}")
    public void deleteMessage(@PathVariable Long id) {
        _messageRepository.delete(id);
    }

    @GetMapping("total")
    public Long getTotalMessages() {
        return _messageRepository.count();
    }
}
