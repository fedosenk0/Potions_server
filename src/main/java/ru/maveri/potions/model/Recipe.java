package ru.maveri.potions.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Table
@Entity
public class Recipe {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @ManyToMany(mappedBy = "recipes",
                fetch = FetchType.LAZY)
    private Set<User> user;


    @ManyToOne
    @MapsId("potion_first")
    private Potion potionFirst;

    @ManyToOne
    @MapsId("potion_second")
    private Potion potionSecond;

    @ManyToOne
    @MapsId("potion_result")
    private Potion potionResult;







}
