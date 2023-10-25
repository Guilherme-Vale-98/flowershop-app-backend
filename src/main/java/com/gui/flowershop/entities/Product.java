package com.gui.flowershop.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer copies;
    private Integer copiesAvailable;
    private String category;
    @Column(name="img")
    private String img;


}
