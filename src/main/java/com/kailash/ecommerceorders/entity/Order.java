package com.kailash.ecommerceorders.entity;


import com.kailash.ecommerceorders.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name="orders")
public class Order extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany(mappedBy="order")
    private List<OrderItem> orderItem;
}
