package ru.maveri.potions.JDBC.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import ru.maveri.potions.model.User;

import java.util.List;

@Data
public class TestRecipeClass {
    @JsonIgnore
    private long id;

    @JsonIgnore
    private List<User> user;


    private TestPotionClass potionFirst;


    private TestPotionClass potionSecond;

    private TestPotionClass potionResult;
}
