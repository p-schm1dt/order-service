package com.peterschmidt.orderservice;

import com.peterschmidt.orderservice.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/order")

public class OrderServiceApplication {
// test
	@RequestMapping("/{orderId}")
	public Order getOrder(@PathVariable("orderId") int id){
		return new Order(id,"Max", "Mustermann", "max@mustermann.com");
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
