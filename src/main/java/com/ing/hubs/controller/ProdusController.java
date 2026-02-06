package com.ing.hubs.controller;

import com.ing.hubs.entity.Produs;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ing.hubs.service.ProdusService;

import java.util.List;

@RestController
@RequestMapping("/produse")
@CrossOrigin(origins = "http://localhost:5173")
public class ProdusController {

    private final ProdusService produsService;

    public ProdusController(ProdusService produsService) {
        this.produsService = produsService;
    }

    @GetMapping
    public List<Produs> getAll() {
        return produsService.getAll();
    }
}
