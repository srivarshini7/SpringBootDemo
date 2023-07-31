package com.example.demo.Controller;
import com.example.demo.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;
    @GetMapping("/sendMessage/{name}")
    public String sendName(@PathVariable("name") String name){
        messageService.sendName(name);
        return name;
    }

}
