package com.johnsong.android.spring;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void handler(String message){
        System.out.println("queue message:: " + message);
    }
}
