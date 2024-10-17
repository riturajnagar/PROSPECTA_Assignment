package com.fakestore.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

    private Long id;
    private String title;
    private String description;
    private Double price;
    private String category;
    private String image;
    private Rating rating;
    
}
