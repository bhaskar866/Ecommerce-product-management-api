package com.Ecommerce.ProductManagement;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {

    public Product() {
        
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String description;

    private float price;

    @JsonIgnore
    private int quantity_available;

    public Product(Long id, String name, String description, float price, int quantity_available) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity_available = quantity_available;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
