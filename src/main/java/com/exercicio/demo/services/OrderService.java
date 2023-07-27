package com.exercicio.demo.services;

import com.exercicio.demo.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public double total (Order order){
        return order.getBasicValue() + shippingService.shipment(order) - (order.getBasicValue() / 100) * order.getDiscount();
    }
}