package com.example.demo.Controller;

import com.example.demo.Service.MessageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(MessageController.class)
public class ActiveMQController {
    @MockBean
    MessageController messageController;
    @Autowired
    MockMvc mockMvc;
    private JmsTemplate jmsTemplate1;
    private JmsTemplate jmsTemplate2;

    @Test
    void findUser() throws Exception {
        List<MessageService> messages = Arrays.asList(new MessageService(jmsTemplate1), new MessageService(jmsTemplate2));
        when(messageController.sendName("Hello")).thenReturn("Hello");
        this.mockMvc.perform(get("/sendMessage/"+"hello")).andDo(print()).andExpect(status().isOk());
    }


}
