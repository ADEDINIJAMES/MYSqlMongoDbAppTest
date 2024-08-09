package com.Tumtech.MongoMysqlProductapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table( name = "Products")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class ProductMY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String producer;
}
