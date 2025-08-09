package com.kailash.ecommerceorders.controller;


import com.kailash.ecommerceorders.request.OrderItemRequest;
import com.kailash.ecommerceorders.request.OrderRequest;
import com.kailash.ecommerceorders.response.OrderCreationResponse;
import com.kailash.ecommerceorders.service.impl.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService)
    {
        this.orderService=orderService;
    }

    @PostMapping
    public ResponseEntity<OrderCreationResponse> createOrder(@RequestBody OrderRequest orderRequest)
    {
        OrderCreationResponse orderCreationResponse=orderService.createOrder(orderRequest);

        return ResponseEntity.ok(orderCreationResponse);
    }

}
