package ru.maveri.potions.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
