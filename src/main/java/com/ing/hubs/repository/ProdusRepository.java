package com.ing.hubs.repository;

import com.ing.hubs.entity.Produs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdusRepository extends MongoRepository<Produs, Integer> {
}
