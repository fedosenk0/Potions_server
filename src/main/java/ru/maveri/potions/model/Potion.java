package ru.maveri.potions.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Potion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


//    @OneToMany(mappedBy = "potion")
//    private Set<UserPotion> potionImages;


    private String name;


    private String description;

    //Параметры не именованы переименовать!!!!!
    private double p1;

    private double p2;

    private double p3;

    private double p4;

    @JsonIgnore

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "potion_id")
    private List<ImageUrl> images;

}
