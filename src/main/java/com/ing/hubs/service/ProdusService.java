package com.ing.hubs.service;

import com.ing.hubs.entity.Produs;
import org.springframework.stereotype.Service;
import com.ing.hubs.repository.ProdusRepository;

import java.util.List;

@Service
public class ProdusService {

    private final ProdusRepository produsRepository;

    public ProdusService(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    public List<Produs> getAll() {
        return produsRepository.findAll();
    }
}
