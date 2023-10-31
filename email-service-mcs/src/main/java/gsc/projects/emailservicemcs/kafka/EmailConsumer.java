package gsc.projects.emailservicemcs.kafka;

import gsc.projects.basicdomains.dtos.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmailConsumer.class);


    @KafkaListener(groupId = "email", topics = "orders_topic")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order event received in email service -> %s", orderEvent.toString()));

    }
}
