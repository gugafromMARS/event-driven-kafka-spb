package gsc.projects.basicdomains.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderId;
    private String name;
    private int quantity;
    private double price;
}
