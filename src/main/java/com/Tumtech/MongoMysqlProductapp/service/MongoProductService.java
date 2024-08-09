package com.Tumtech.MongoMysqlProductapp.service;

import com.Tumtech.MongoMysqlProductapp.entity.ProductMO;
import com.Tumtech.MongoMysqlProductapp.entity.ProductMY;
import com.Tumtech.MongoMysqlProductapp.repository.MongoProductRepostory;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MongoProductService {
    private MongoProductRepostory mongoProductRepostory;
    @Autowired
    public MongoProductService(MongoProductRepostory mongoProductRepostory){
        this.mongoProductRepostory=mongoProductRepostory;
    }
    public String saveMongProduct(ProductMO productMO) {
        ProductMO productToSave = ProductMO.builder()
                .type(productMO.getType())
                .name(productMO.getName())
                .producer(productMO.getProducer())
                .build();

        System.out.println("Before save: " + productToSave.getId()); // Should be null

        ProductMO savedProduct = mongoProductRepostory.save(productToSave);

        System.out.println("After save: " + savedProduct.getId()); // Should be non-null

        return "Product Mongo saved with ID: " + savedProduct.getId() + " and Name: " + savedProduct.getName();
    }

public ProductMO getMongoProduct (String id){

    return mongoProductRepostory.findById(id).orElseThrow(()-> new RuntimeException("Mongo Product not found"));

}

}
