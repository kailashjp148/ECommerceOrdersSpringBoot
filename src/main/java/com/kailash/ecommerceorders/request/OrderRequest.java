package com.kailash.ecommerceorders.request;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderRequest {

    private Long userId;

    private List<OrderItemRequest> items;
}
