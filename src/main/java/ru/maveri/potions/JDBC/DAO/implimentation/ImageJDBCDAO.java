package ru.maveri.potions.JDBC.DAO.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import ru.maveri.potions.JDBC.DAO.Interface.ImageDAORepo;
import ru.maveri.potions.JDBC.util.Util;
import ru.maveri.potions.model.ImageUrl;

import java.sql.*;
import java.util.Optional;

public class ImageJDBCDAO  implements ImageDAORepo {

    @Autowired
    private ImageUrl imageUrl;


    @Override
    public Optional<ImageUrl> findById(long id) {
        Connection connection = Util.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT iu.url FROM image_url iu WHERE iu.id = ?");
            preparedStatement.setLong(1,id);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                imageUrl.setUrl(resultSet.getString("url"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.of(imageUrl);
    }
}
