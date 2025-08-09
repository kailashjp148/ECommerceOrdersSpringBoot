package com.kailash.ecommerceorders.request;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class OrderItemRequest {

    private Long productId;

    private Long quantity;

}
