package com.ing.hubs.service;

import com.ing.hubs.entity.Categorie;
import com.ing.hubs.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> getAll() {
        return categorieRepository.findAll();
    }
}
