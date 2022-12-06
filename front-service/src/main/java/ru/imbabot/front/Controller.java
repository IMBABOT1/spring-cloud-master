package ru.imbabot.front;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.imbabot.common.ProductDto;

import java.util.List;


@RestController
public class Controller {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/api/v1/front")
    public List<ProductDto> getProducts(){
        List<ProductDto> data = restTemplate.getForObject("http://product-service/api/v1/products", List.class);
        return data;
    }
}
