package ru.maveri.potions.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Table
@Entity
@Component
public class Recipe {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long id;

    @JsonIgnore
    @ManyToMany(mappedBy = "recipes",
                fetch = FetchType.LAZY)
    private List<User> user;


    @ManyToOne
    @MapsId("potion_first")
    private Potion potionFirst;


    @ManyToOne
    @MapsId("potion_second")
    private Potion potionSecond;

    @ManyToOne
    @MapsId("potion_result")
    private Potion potionResult;

    public String getFirstPotionName(){
       return potionFirst.getName();
    }

    public String getSecondPotionName(){
       return potionSecond.getName();
    }

    public String getResultPotionName(){
       return potionResult.getName();
    }
}
