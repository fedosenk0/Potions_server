package ru.maveri.potions.JDBC.DAO.Interface;

import ru.maveri.potions.model.ImageUrl;

import java.util.Optional;

public interface ImageDAORepo {
    public Optional<ImageUrl> findById(long id);
}
