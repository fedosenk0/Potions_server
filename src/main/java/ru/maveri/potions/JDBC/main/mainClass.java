package ru.maveri.potions.JDBC.main;

import ru.maveri.potions.JDBC.DAO.implimentation.UserJDBCDAO;
import ru.maveri.potions.JDBC.DAO.Interface.UserDAORepo;

import java.sql.SQLException;

public class mainClass {
    public static void main(String[] args) throws SQLException {
        UserDAORepo userJDBC = new UserJDBCDAO();
        //System.out.println(userJDBC.findAllUser((long)1));
    }
}
