package com.Tumtech.MongoMysqlProductapp.controller;

import com.Tumtech.MongoMysqlProductapp.entity.ProductMO;
import com.Tumtech.MongoMysqlProductapp.service.MongoProductService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mongo")
public class MongoProductController {
    @Autowired
    private MongoProductService mongoProductService;
    @PostMapping
    public ResponseEntity<String> saveMongoProduct (@RequestBody ProductMO productMO){
        return ResponseEntity.ok(mongoProductService.saveMongProduct(productMO));
    }
    @GetMapping("/{id}")
public ResponseEntity<ProductMO> getProduct (@PathVariable String id){
        return ResponseEntity.ok(mongoProductService.getMongoProduct(id));
}
}
