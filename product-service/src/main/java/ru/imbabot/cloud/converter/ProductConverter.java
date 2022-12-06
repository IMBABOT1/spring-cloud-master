package ru.imbabot.cloud.converter;

import org.springframework.stereotype.Component;
import ru.imbabot.cloud.entities.Product;
import ru.imbabot.common.ProductDto;

@Component
public class ProductConverter {

    public Product dtoToEntity(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getTitle(), productDto.getPrice());
    }


    public ProductDto entityToDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice());
    }
}
