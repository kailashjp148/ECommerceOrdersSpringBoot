package com.kailash.ecommerceorders.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    Long id;

    String title;
    String image;
    Integer price;
    String description;
    String brand;
    String model;
    String color;
    Long categoryId;
    Integer discount;
}
