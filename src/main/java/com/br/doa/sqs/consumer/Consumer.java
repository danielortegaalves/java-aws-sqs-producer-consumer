package com.br.doa.sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @SqsListener("minha-fila")
    public void listen(Message message) {
        System.out.println("Message received: " + message.content());
    }
}
