package com.ing.hubs.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="categorii")
public class Categorie {

    @Id
    private Integer id;

    private String nume;

    public Integer getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }
}
