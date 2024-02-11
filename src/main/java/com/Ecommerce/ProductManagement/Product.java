package com.Ecommerce.ProductManagement;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {

    public Product() {
        
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long product_id;

    private String name;

    private String description;

    private float price;

    private int quantity_available;

    public Product(Long product_id, String name, String description, float price, int quantity_available) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity_available = quantity_available;
    }

    

    public Long getId() {
        return product_id;
    }

    public void setId(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantity_available;
    }

    public void setQuantityAvailable(int quantity_available) {
        this.quantity_available = quantity_available;
    }
}
