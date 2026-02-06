package com.ing.hubs.service;

import com.ing.hubs.entity.Furnizor;
import com.ing.hubs.repository.FurnizorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnizorService {
    private final FurnizorRepository furnizorRepository;

    public FurnizorService(FurnizorRepository furnizorRepository) {
        this.furnizorRepository = furnizorRepository;
    }

    public List<Furnizor> getAll() {
        return furnizorRepository.findAll();
    }
}
