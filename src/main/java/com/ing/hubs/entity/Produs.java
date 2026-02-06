package com.ing.hubs.entity;

import com.mongodb.lang.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="produse")
public class Produs {

    @Id
    private Integer id;

    private String nume;

    private Integer pret;

    private Integer categorie_id;

    private String furnizor_id;

    @Nullable
    private Integer reducere;

    public Integer getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Integer getPret() {
        return pret;
    }

    public Integer getCategorie_id() {
        return categorie_id;
    }

    public String getFurnizor_id() {
        return furnizor_id;
    }

    @Nullable
    public Integer getReducere() {
        return reducere;
    }
}
