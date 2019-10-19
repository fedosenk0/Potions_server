package ru.maveri.potions.JDBC.DAO.Interface;

import org.springframework.stereotype.Repository;
import ru.maveri.potions.model.Coordinate;

import java.util.List;
import java.util.Optional;


public interface CoordinateDAORepo {
    public Optional<Coordinate> getCoordinateById(long id);
    public List<Coordinate> findByLatitudeBetweenAndLongitudeBetween(Long lat, Long latr, Long lon, Long lonr);
}
