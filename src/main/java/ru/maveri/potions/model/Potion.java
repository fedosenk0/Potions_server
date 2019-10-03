package ru.maveri.potions.model;


import lombok.Data;
import ru.maveri.potions.model.join.table.PotionImage;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table
public class Potion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


//    @OneToMany(mappedBy = "potion")
//    private Set<PotionImage> potionImages;


    private String name;

    private String description;

    //Параметры не именованы переименовать!!!!!
    private double p1;

    private double p2;

    private double p3;

    private double p4;


}
