package ru.maveri.potions.JDBC.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class TestUserClass {



        private long id;


        private String login;
        private String mail;
        private String password;


        private TestCoordinateClass coordinate;

        List<TestPotionClass> potions;

        private List<TestRecipeClass> recipes;


}
