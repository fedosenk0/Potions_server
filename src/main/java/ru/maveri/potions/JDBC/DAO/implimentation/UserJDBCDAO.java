package ru.maveri.potions.JDBC.DAO.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import ru.maveri.potions.JDBC.DAO.Interface.CoordinateDAORepo;
import ru.maveri.potions.JDBC.DAO.Interface.PotionJDBCInt;
import ru.maveri.potions.JDBC.DAO.Interface.RecipeJDBCInt;
import ru.maveri.potions.JDBC.DAO.Interface.UserDAORepo;
import ru.maveri.potions.JDBC.util.Util;
import ru.maveri.potions.model.Coordinate;
import ru.maveri.potions.model.User;

import java.sql.*;
import java.util.Optional;

public class UserJDBCDAO  implements UserDAORepo {

    @Autowired
    private CoordinateDAORepo coordinateJDBCInt;
    @Autowired
    private RecipeJDBCInt recipeJDBCInt;
    @Autowired
    private PotionJDBCInt potionJDBCInt;
    @Autowired
    private User user;

    public Optional<User> findUser(Long userId) {
        Coordinate coordinate = new Coordinate();
        try {
            Connection connection = Util.getConnection();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setLong(1, userId);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setLogin(resultSet.getString("login"));
                user.setMail(resultSet.getString("mail"));
                user.setPassword(resultSet.getString("password"));
                coordinate.setId(resultSet.getLong("coordinate_id"));
                user.setCoordinate(coordinate);
            }
            preparedStatement.cancel();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.of(user);
    }

    @Override
    public Optional<User> findById(Long userId) {
        User user = findUser(userId).get();
        user.setCoordinate(coordinateJDBCInt.getCoordinateById(user.getCoordinate().getId()).get());
        user.setRecipes(recipeJDBCInt.findAllReceptForUser(userId));
        user.setPotions(potionJDBCInt.getAllPotionsForUser(userId));
        return Optional.of(user);
    }

}

