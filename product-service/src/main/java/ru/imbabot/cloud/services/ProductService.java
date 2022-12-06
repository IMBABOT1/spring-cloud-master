package ru.imbabot.cloud.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.imbabot.cloud.entities.Product;
import ru.imbabot.cloud.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
