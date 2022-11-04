package dev.draxano.SpringBootJPAHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.draxano.SpringBootJPAHibernate.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
