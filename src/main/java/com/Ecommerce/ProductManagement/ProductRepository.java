package com.Ecommerce.ProductManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Ecommerce.ProductManagement.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
