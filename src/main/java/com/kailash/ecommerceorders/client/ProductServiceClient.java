package com.kailash.ecommerceorders.client;

import com.kailash.ecommerceorders.response.ProductResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductServiceClient {

    private final RestTemplateBuilder restTemplateBuilder;

    public ProductServiceClient(RestTemplateBuilder restTemplateBuilder )
    {
        this.restTemplateBuilder=restTemplateBuilder;
    }

    public ProductResponse getProductById(Long id)
    {
        String url="http://localhost:8083/api/products/" +id;

        RestTemplate restTemplate=restTemplateBuilder.build();

        return restTemplate.getForObject(url, ProductResponse.class);
    }


}
