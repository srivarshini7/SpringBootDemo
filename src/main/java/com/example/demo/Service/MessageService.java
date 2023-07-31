package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
@Component
public class MessageService {
    private JmsTemplate jmsTemplate;
    @Autowired
    public MessageService(JmsTemplate jmsTemplate){
        this.jmsTemplate= jmsTemplate;
    }
    public void sendName(String name){
        jmsTemplate.convertAndSend("The Queue",name);
    }
}
