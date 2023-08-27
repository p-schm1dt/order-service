package com.peterschmidt.orderservice;

import com.peterschmidt.orderservice.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/order")

public class OrderServiceApplication {
	// test
	@RequestMapping("/{orderId}")
	public Order getOrder(@PathVariable("orderId") int id){
		List<String> products = new ArrayList<>();
		products.add("iPhone");
		products.add("iPad");
		return new Order(id, products, 1899.98);
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}