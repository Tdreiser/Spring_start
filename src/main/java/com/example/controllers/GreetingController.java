package com.example.controllers;


import com.example.entities.Messages;
import com.example.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

import static java.lang.Integer.valueOf;


@Controller
public class GreetingController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<Messages> messages = messageRepository.findAll();
        model.put("messages",messages);
        return "main";
    }
    @PostMapping
    public String add(@RequestParam String text,
                      @RequestParam String userId,
                      @RequestParam String themeId,
                      Map<String, Object> model){
        Messages message = new Messages(valueOf(themeId),valueOf(userId),text,0,0);
        messageRepository.save(message);

        Iterable<Messages> messages = messageRepository.findAll();
        model.put("messages",messages);
        return "main";
    }


}

