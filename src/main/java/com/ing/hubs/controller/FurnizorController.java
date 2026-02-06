package com.ing.hubs.controller;

import com.ing.hubs.entity.Furnizor;
import com.ing.hubs.service.FurnizorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/furnizori")
@CrossOrigin(origins = "http://localhost:5173")
public class FurnizorController {

    private final FurnizorService furnizorService;

    public FurnizorController(FurnizorService furnizorService) {
        this.furnizorService = furnizorService;
    }

    @GetMapping
    public List<Furnizor> getAll() {
        return furnizorService.getAll();
    }
}
