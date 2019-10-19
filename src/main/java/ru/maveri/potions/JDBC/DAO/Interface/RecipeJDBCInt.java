package ru.maveri.potions.JDBC.DAO.Interface;

import org.springframework.stereotype.Repository;
import ru.maveri.potions.model.Recipe;

import java.util.ArrayList;


public interface RecipeJDBCInt {
    public ArrayList<Recipe> findAllReceptForUser(Long id);
}
