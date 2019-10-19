package ru.maveri.potions.JDBC.DAO.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.maveri.potions.JDBC.DAO.Interface.CoordinateDAORepo;
import ru.maveri.potions.JDBC.DAO.Interface.ImageDAORepo;
import ru.maveri.potions.JDBC.DAO.Interface.UserDAORepo;
import ru.maveri.potions.JDBC.DAO.implimentation.CoordinateJDBCDAO;
import ru.maveri.potions.JDBC.DAO.implimentation.ImageJDBCDAO;
import ru.maveri.potions.JDBC.DAO.implimentation.UserJDBCDAO;

@Configuration
public class RepoConfig {

    @Bean
    public CoordinateDAORepo getCoordinateRepo(){
        return new CoordinateJDBCDAO();
    }

    @Bean
    public UserDAORepo getUserRepo(){
        return new UserJDBCDAO();
    }

    @Bean
    public ImageDAORepo getImageRepo(){
        return new ImageJDBCDAO();
    }
}
