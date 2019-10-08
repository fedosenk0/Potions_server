package ru.maveri.potions.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class ImageUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String url;



    public ImageUrl(String url) {
        this.url =  url;

    }
    public ImageUrl() {

    }
}
