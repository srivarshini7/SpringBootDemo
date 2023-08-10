package com.example.demo.Service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jms.core.JmsTemplate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;


@SpringBootTest
public class ActiveMQServiceTests {

    @MockBean
    JmsTemplate jmsTemplate;

    @Autowired
    private MessageService messageService;

    @Test
    void sendMessage() {
        String message = "Hello";
        messageService.sendName(message);
        verify(jmsTemplate, times(1)).convertAndSend("The Queue", message);
    }



}
