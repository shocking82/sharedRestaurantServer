package com.johnsong.android.spring;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(cron = "*/10 * * * * *")
    public void scheduleSend(){
        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE, "test");
    }

    public void sendTo(String routingKey, String message){
        this.rabbitTemplate.convertAndSend(routingKey, message);
    }
}
