package com.sivainc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sivainc.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
