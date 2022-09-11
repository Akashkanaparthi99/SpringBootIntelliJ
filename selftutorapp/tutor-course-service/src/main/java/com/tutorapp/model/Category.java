package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {

    private String categoryName;
    @Id
    @GeneratedValue(generator = "category_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "category_gen",sequenceName = "category_sequence",initialValue = 50,allocationSize = 50)
    @ToString.Exclude
    private Integer categoryId;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
