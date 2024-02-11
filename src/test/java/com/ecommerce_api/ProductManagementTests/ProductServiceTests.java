package com.ecommerce_api.ProductManagementTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.Ecommerce.ProductManagement.Product;
import com.Ecommerce.ProductManagement.ProductService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductServiceTests {

    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductService();
    }

    @Test
    public void testGetAllProducts() {
        // Prepare test data
        Product product1 = new Product(1L, "Test Product 1", "Description 1", 10.0f, 100);
        Product product2 = new Product(2L, "Test Product 2", "Description 2", 20.0f, 200);

        // Call the method under test
        List<Product> result = productService.getAllProducts();

        // Assert the result
        assertEquals(2, result.size());
        assertEquals(product1.getName(), result.get(0).getName());
        assertEquals(product2.getName(), result.get(1).getName());
    }

    @Test
    public void testGetProductById() {
        // Prepare test data
        Long productId = 1L;
        Product product = new Product(productId, "Test Product", "Description", 10.0f, 100);

        // Call the method under test
        Product result = productService.getProductById(productId);

        // Assert the result
        assertEquals(product.getName(), result.getName());
        assertEquals(product.getDescription(), result.getDescription());
    }

    @Test
    public void testCreateProduct() {
        // Prepare test data
        Product product = new Product(1L, "Test Product", "Description", 10.0f, 100);

        // Call the method under test
        Product result = productService.createProduct(product);

        // Assert the result
        assertEquals(product.getName(), result.getName());
        assertEquals(product.getDescription(), result.getDescription());
    }

    @Test
    public void testUpdateProduct() {
        // Prepare test data
        Long productId = 1L;
        Product existingProduct = new Product(productId, "Test Product", "Description", 10.0f, 100);
        Product updatedProduct = new Product(productId, "Updated Product", "Updated Description", 20.0f, 200);

        // Call the method under test
        Product result = productService.updateProduct(productId, updatedProduct);

        // Assert the result
        assertEquals(updatedProduct.getName(), result.getName());
        assertEquals(updatedProduct.getDescription(), result.getDescription());
        assertEquals(updatedProduct.getPrice(), result.getPrice());
        assertEquals(updatedProduct.getQuantityAvailable(), result.getQuantityAvailable());
    }

    @Test
    public void testDeleteProduct() {
        // Call the method under test
        productService.deleteProduct(1L);

        // No need to assert anything here since it's a void method
    }
}
