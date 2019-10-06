package ru.maveri.potions.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class ImageUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String url;


}
