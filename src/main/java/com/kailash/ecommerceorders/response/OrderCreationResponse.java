package com.kailash.ecommerceorders.response;

import com.kailash.ecommerceorders.enums.OrderStatus;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreationResponse {

    private Long orderId;

    private OrderStatus status;

}
