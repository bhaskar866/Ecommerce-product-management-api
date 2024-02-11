package com.ecommerce_api.ProductManagementTests;

import com.Ecommerce.ProductManagement.Product;
import com.Ecommerce.ProductManagement.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Initialize mocks
public class ProductServiceTest {

    @Mock
    private ProductService productService;

    @Test
    public void testCreateProduct() {
        
        Product product = new Product(1L, "Test Product", "Description", 10.0f, 100);

        when(productService.createProduct(product)).thenReturn(product);

        Product result = productService.createProduct(product);

        assertEquals(product.getName(), result.getName());
        assertEquals(product.getDescription(), result.getDescription());
        assertEquals(product.getPrice(), result.getPrice());
        assertEquals(product.getQuantityAvailable(), result.getQuantityAvailable());
    }
}
