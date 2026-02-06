package com.ing.hubs.repository;

import com.ing.hubs.entity.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategorieRepository extends MongoRepository<Categorie, Integer> {
}
