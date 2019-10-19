package ru.maveri.potions.JDBC.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class TestPotionClass {
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


}
