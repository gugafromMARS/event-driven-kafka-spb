package gsc.projects.orderservicemcs.controller;


import gsc.projects.basicdomains.dtos.Order;
import gsc.projects.orderservicemcs.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public ResponseEntity<?> send(@RequestBody Order order){
        orderService.sendOrder(order);
        return ResponseEntity.ok("Order sent successfully");
    }
}
