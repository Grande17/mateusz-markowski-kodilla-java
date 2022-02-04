package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
