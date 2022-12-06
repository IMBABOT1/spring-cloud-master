package ru.imbabot.cloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.imbabot.cloud.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
