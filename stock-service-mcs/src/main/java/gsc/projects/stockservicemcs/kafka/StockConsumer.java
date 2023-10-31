package gsc.projects.stockservicemcs.kafka;


import gsc.projects.basicdomains.dtos.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StockConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(StockConsumer.class);

    @KafkaListener(groupId = "stock", topics = "orders_topic")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order event received in stock service -> %s", orderEvent.toString()));


    }
}
