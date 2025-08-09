package com.kailash.ecommerceorders.service;

import com.kailash.ecommerceorders.request.OrderRequest;
import com.kailash.ecommerceorders.response.OrderCreationResponse;

public interface IOrderService {

    public OrderCreationResponse createOrder(OrderRequest orderRequest);
}
