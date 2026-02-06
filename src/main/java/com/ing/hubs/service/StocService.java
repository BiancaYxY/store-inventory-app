package com.ing.hubs.service;

import com.ing.hubs.entity.Stoc;
import com.ing.hubs.repository.StocRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocService {

    private final StocRepository stocRepository;
    public StocService(StocRepository stocRepository) {
        this.stocRepository = stocRepository;
    }

    public List<Stoc> getAll() {
        return stocRepository.findAll();
    }
}
