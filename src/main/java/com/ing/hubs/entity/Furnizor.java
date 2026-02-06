package com.ing.hubs.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "furnizori")
public class Furnizor {

    @Id
    private String id;

    private String nume;

    private String oras;

    private String telefon;

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getOras() {
        return oras;
    }

    public String getTelefon() {
        return telefon;
    }
}
