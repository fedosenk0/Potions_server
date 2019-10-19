package ru.maveri.potions.JDBC.DAO.Interface;

import ru.maveri.potions.model.User;

import java.sql.SQLException;
import java.util.Optional;

public interface UserDAORepo {
     public Optional<User> findById(Long id) ;
}
