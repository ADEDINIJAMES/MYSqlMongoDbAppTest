package com.Tumtech.MongoMysqlProductapp.service;

import com.Tumtech.MongoMysqlProductapp.entity.ProductMO;
import com.Tumtech.MongoMysqlProductapp.entity.ProductMY;
import com.Tumtech.MongoMysqlProductapp.repository.MysqlProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MysqlProductService {
    private MysqlProductRepository mysqlProductRepository;
    @Autowired
    public MysqlProductService(MysqlProductRepository mysqlProductRepository){
        this.mysqlProductRepository=mysqlProductRepository;
    }

    public String saveMySQLProduct (ProductMY productM){

        ProductMY productM1= mysqlProductRepository.save( ProductMY.builder().
                name(productM.getName())
                .type(productM.getType())
                .producer(productM.getProducer())
                .build());
        System.out.println(productM1.getId()+ "product m id");
        return "product saved in MYSQL"+productM1.getId();
    }

    public ProductMY getMysqlProduct(Long id){
        return mysqlProductRepository.findById(id).orElseThrow(()-> new RuntimeException("product not found "));
    }
}
