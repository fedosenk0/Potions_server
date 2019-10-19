package ru.maveri.potions.JDBC.DAO.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.maveri.potions.JDBC.DAO.Interface.RecipeJDBCInt;
import ru.maveri.potions.JDBC.util.Util;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.model.Recipe;

import java.sql.*;
import java.util.ArrayList;

@Repository
public class RecipeJDBCDAO  implements RecipeJDBCInt {

    private Recipe recipe;
    private Potion firstPotion;
    private Potion secondPotion;
    private Potion resultPotion;

    @Autowired
    public RecipeJDBCDAO(Recipe recipe, Potion firstPotion, Potion secondPotion, Potion resultPotion) {
        this.recipe = recipe;
        this.firstPotion = firstPotion;
        this.secondPotion = secondPotion;
        this.resultPotion = resultPotion;
    }

    @Override
    public ArrayList<Recipe> findAllReceptForUser(Long userId) {


        ArrayList <Recipe> arrayList = new ArrayList<>();
        Connection connection = Util.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM recipe r WHERE r.id = " +
                    "(SELECT ur.recipe_id FROM user_recipe ur WHERE ur.user_id = ?)");
            preparedStatement.setLong(1,userId);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                recipe.setId(resultSet.getInt("id"));
                firstPotion.setId(resultSet.getInt("potion_first_id"));
                secondPotion.setId(resultSet.getInt("potion_second_id"));
                resultPotion.setId(resultSet.getInt("potion_result_id"));
                recipe.setPotionFirst(firstPotion);
                recipe.setPotionSecond(secondPotion);
                recipe.setPotionResult(resultPotion);
                arrayList.add(recipe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
