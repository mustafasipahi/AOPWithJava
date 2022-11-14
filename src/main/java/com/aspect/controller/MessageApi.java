package com.aspect.controller;

import com.aspect.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageApi {

    private final MessageService messageService;

    public MessageApi(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> search(@PathVariable String message) {
        return ResponseEntity.ok().body(messageService.sendMessage(message));
    }
}
