package gsc.projects.orderservicemcs.service;


import gsc.projects.basicdomains.dtos.Order;
import gsc.projects.basicdomains.dtos.OrderEvent;
import gsc.projects.orderservicemcs.kafka.OrderProducer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private  OrderProducer orderProducer;

    public OrderService(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    public void sendOrder(Order order){
        order.setOrderId(UUID.randomUUID().toString());

        OrderEvent orderEvent = new OrderEvent();

        orderEvent.setStatus("Pending");
        orderEvent.setMessage("Order is pending");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);
    }
}
