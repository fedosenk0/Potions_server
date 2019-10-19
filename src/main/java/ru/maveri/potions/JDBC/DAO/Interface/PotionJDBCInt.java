package ru.maveri.potions.JDBC.DAO.Interface;

import org.springframework.stereotype.Repository;
import ru.maveri.potions.model.join.table.UserPotion;

import java.util.ArrayList;


public interface PotionJDBCInt {
    public ArrayList<UserPotion> getAllPotionsForUser(Long id);
}
