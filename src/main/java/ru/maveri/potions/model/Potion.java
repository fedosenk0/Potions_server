package ru.maveri.potions.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Potion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;


//    @OneToMany(mappedBy = "potion")
//    private Set<UserPotion> potionImages;


    private String name;


    private String description;

    //Параметры не именованы переименовать!!!!!
    private double p1;

    private double p2;

    private double p3;

    private double p4;

    public String getName() {
        return name;
    }

}
