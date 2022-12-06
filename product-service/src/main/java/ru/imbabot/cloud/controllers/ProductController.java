package ru.imbabot.cloud.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.imbabot.cloud.converter.ProductConverter;
import ru.imbabot.cloud.entities.Product;
import ru.imbabot.cloud.services.ProductService;
import ru.imbabot.common.ProductDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductController {

    private final ProductService productService;
    private final ProductConverter productConverter;

    @GetMapping
    public List<ProductDto> findAll(){
        List<Product> products = productService.findAll();
        List<ProductDto> dto = new ArrayList<>();
        for (Product p : products){
            dto.add(productConverter.entityToDto(p));
        }
        return dto;
    }
}
