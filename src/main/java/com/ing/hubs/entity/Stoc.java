package com.ing.hubs.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="stocuri")
public class Stoc {

    @Id
    private String id;

    private String produs_id;

    private Integer cantitate;

    public String getId() {
        return id;
    }

    public String getProdus_id() {
        return produs_id;
    }

    public Integer getCantitate() {
        return cantitate;
    }
}
