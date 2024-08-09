package com.Tumtech.MongoMysqlProductapp.controller;

import com.Tumtech.MongoMysqlProductapp.entity.ProductMY;
import com.Tumtech.MongoMysqlProductapp.service.MysqlProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mysql")
public class MysQLProductController {
    @Autowired
    private MysqlProductService mysqlProductService;
    @PostMapping
    public ResponseEntity<String> savedMysqlProduct (@RequestBody ProductMY productMY){
        return ResponseEntity.ok(mysqlProductService.saveMySQLProduct(productMY));
    }
    @GetMapping("/{id}")
public  ResponseEntity<ProductMY> getMysqlProduct   (@PathVariable Long id){
        return ResponseEntity.ok(mysqlProductService.getMysqlProduct(id));
}
}
