package com.Tumtech.MongoMysqlProductapp.repository;

import com.Tumtech.MongoMysqlProductapp.entity.ProductMO;
import com.Tumtech.MongoMysqlProductapp.entity.ProductMY;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MysqlProductRepository extends JpaRepository<ProductMY, Long> {
}
