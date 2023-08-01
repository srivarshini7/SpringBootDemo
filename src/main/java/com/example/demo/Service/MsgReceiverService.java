package com.example.demo.Service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class MsgReceiverService {
    @JmsListener(destination = "The Queue")
    public void listener(String message) {
        System.out.println("The message sent from the Queue - " + message);
    }
}
