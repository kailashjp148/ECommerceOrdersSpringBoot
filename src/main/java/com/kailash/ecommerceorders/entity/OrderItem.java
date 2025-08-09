package com.kailash.ecommerceorders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name="orderitem")
public class OrderItem extends BaseEntity {

    private Long productId;

    private Long quantity;

    private double pricePerUnit;

    private double totalPrice;

    @ManyToOne
    @JoinColumn(name="orderId")
    private Order order;

}
