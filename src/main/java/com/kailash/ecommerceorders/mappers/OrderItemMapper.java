package com.kailash.ecommerceorders.mappers;

import com.kailash.ecommerceorders.entity.OrderItem;
import com.kailash.ecommerceorders.request.OrderItemRequest;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemRequest orderItemRequest,Integer pricePerProduct,Long totalPrice)
    {
        return OrderItem.builder()
                .productId(orderItemRequest.getProductId())
                .quantity(orderItemRequest.getQuantity())
                .pricePerUnit(pricePerProduct)
                .totalPrice(totalPrice)
                .build();
    }
}
