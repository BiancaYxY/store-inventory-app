package com.ing.hubs.repository;

import com.ing.hubs.entity.Stoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StocRepository extends MongoRepository<Stoc, String> {
}
