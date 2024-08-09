package com.Tumtech.MongoMysqlProductapp.repository;

import com.Tumtech.MongoMysqlProductapp.entity.ProductMO;
import com.Tumtech.MongoMysqlProductapp.entity.ProductMY;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoProductRepostory extends MongoRepository<ProductMO, String>{

}
