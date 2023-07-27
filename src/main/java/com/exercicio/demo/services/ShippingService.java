package com.exercicio.demo.services;

import com.exercicio.demo.models.Order;
import org.springframework.stereotype.Component;

@Component
public class ShippingService {

    public double shipment(Order order){
        double shipment = 0;

        if (order.getBasicValue() < 100){
            return shipment = 20;
        } else if (order.getBasicValue() >= 100 && order.getBasicValue() < 200) {
            return shipment = 12;
        } else if (order.getBasicValue() >= 200) {
            return shipment = 0;
        }
        return shipment;
    }
}