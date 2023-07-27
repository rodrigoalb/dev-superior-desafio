package com.exercicio.demo;

import com.exercicio.demo.models.Order;
import com.exercicio.demo.services.OrderService;
import com.exercicio.demo.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
public class ExercicioApplication implements CommandLineRunner {
	@Autowired
	private ShippingService shippingService;
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira o código do pedido: ");
		int code = scanner.nextInt();
		System.out.print("Insira o valor do pedido: ");
		double basic = scanner.nextDouble();
		System.out.print("Insira o valor do desconto: ");
		double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Código do pedido: " + order.getCode());
		System.out.printf("Valor total: %.2f%n", + orderService.total(order));
	}
}