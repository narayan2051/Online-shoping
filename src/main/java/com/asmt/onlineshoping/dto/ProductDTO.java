package com.asmt.onlineshoping.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
    private String name;
    private String category;
    private String description;
    private Double price;
    private Integer quantity;
}
