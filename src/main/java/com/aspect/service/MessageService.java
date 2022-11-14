package com.aspect.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String sendMessage(String param) {

        if (param.equalsIgnoreCase("throw")) {
            System.out.println("sendMessage -> throw " + param);
            throw new RuntimeException("deneme");
        }

        System.out.println("sendMessage " + param);
        return param;
    }
}
