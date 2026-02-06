package com.ing.hubs.controller;

import com.ing.hubs.entity.Stoc;
import com.ing.hubs.service.StocService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stocuri")
@CrossOrigin(origins = "http://localhost:5173")
public class StocController {

    private final StocService stocService;

    public StocController(StocService stocService) {
        this.stocService = stocService;
    }

    @GetMapping
    public List<Stoc> getAll() {
        return stocService.getAll();
    }
}
