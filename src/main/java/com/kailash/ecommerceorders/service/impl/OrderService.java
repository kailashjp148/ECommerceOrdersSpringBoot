package com.kailash.ecommerceorders.service.impl;

import com.kailash.ecommerceorders.client.ProductServiceClient;
import com.kailash.ecommerceorders.entity.Order;
import com.kailash.ecommerceorders.entity.OrderItem;
import com.kailash.ecommerceorders.enums.OrderStatus;
import com.kailash.ecommerceorders.mappers.OrderItemMapper;
import com.kailash.ecommerceorders.repository.OrderRepository;
import com.kailash.ecommerceorders.request.OrderItemRequest;
import com.kailash.ecommerceorders.request.OrderRequest;
import com.kailash.ecommerceorders.response.OrderCreationResponse;
import com.kailash.ecommerceorders.response.ProductResponse;
import com.kailash.ecommerceorders.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    private OrderRepository orderRepository;

    private ProductServiceClient productServiceClient;

    public OrderService(OrderRepository orderRepository,ProductServiceClient productServiceClient)
    {
        this.orderRepository=orderRepository;
        this.productServiceClient=productServiceClient;
    }

    @Override
    public OrderCreationResponse createOrder(OrderRequest orderRequest) {

        List<OrderItemRequest> orderItemRequestList=orderRequest.getItems();

        List<OrderItem> orderItems=new ArrayList<>();

        for(OrderItemRequest itemRequest:orderItemRequestList)
        {
            Long productId=itemRequest.getProductId();

            ProductResponse productResponse= productServiceClient.getProductById(productId);

            Integer pricePerProduct=productResponse.getPrice();

            Long totalPrice=pricePerProduct*itemRequest.getQuantity();

            OrderItem orderItem= OrderItemMapper.toEntity(itemRequest,pricePerProduct,totalPrice);

            orderItems.add(orderItem);

        }

        Order order= Order.builder()
                .orderStatus(OrderStatus.PENDING)
                .orderItem(orderItems)
                .build();

        Order createdOrder=orderRepository.save(order);


        return OrderCreationResponse.builder()
                .orderId(createdOrder.getId())
                .status(createdOrder.getOrderStatus())
                .build();
    }
}
