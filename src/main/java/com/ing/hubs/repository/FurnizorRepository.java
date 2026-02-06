package com.ing.hubs.repository;

import com.ing.hubs.entity.Furnizor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FurnizorRepository extends MongoRepository<Furnizor, String> {

}
