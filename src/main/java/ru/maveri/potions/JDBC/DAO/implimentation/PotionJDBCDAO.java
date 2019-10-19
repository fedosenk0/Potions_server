package ru.maveri.potions.JDBC.DAO.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.maveri.potions.JDBC.DAO.Interface.PotionJDBCInt;
import ru.maveri.potions.JDBC.util.Util;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.model.join.table.UserPotion;

import java.sql.*;
import java.util.ArrayList;

@Repository
public class PotionJDBCDAO implements PotionJDBCInt {
    private Potion potion;
    private UserPotion userPotion;

    @Autowired
    public PotionJDBCDAO(Potion potion, UserPotion userPotion) {
        this.potion = potion;
        this.userPotion = userPotion;
    }

    @Override
    public ArrayList<UserPotion> getAllPotionsForUser(Long userId) {
        Connection connection = Util.getConnection();
        PreparedStatement preparedStatement = null;
        ArrayList<UserPotion> arrayList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM potion p WHERE p.id = " +
                    "(SELECT up.potion_id FROM user_potion up WHERE up.user_id = ?)");
            preparedStatement.setLong(1,userId);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                potion.setId(resultSet.getInt("id"));
                potion.setName(resultSet.getString("name"));
                potion.setDescription(resultSet.getString("description"));
                potion.setP1(resultSet.getDouble("p1"));
                potion.setP2(resultSet.getDouble("p2"));
                potion.setP3(resultSet.getDouble("p3"));
                potion.setP4(resultSet.getDouble("p4"));
                userPotion.setPotion(potion);
                arrayList.add(userPotion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
