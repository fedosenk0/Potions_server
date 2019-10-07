package ru.maveri.potions.model;


import lombok.Data;
import ru.maveri.potions.model.join.table.UserPotion;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String login;
    private String mail;
    private String password;



    @OneToOne
    @JoinColumn(name = "coordinate_id")
    private Coordinate coordinate;


    @OneToMany(mappedBy = "users")
    List<UserPotion> potions;




    @ManyToMany()
    @JoinTable(
            name = "user_recipe",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn (name = "recipe_id")}
    )
    private List<Recipe> recipes;








}
