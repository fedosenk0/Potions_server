package ru.maveri.potions.repo;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;
import ru.maveri.potions.model.Coordinate;

import java.util.List;

public interface CoordinateRepo extends Repository<Coordinate,Long> {
        List<Coordinate> findByLatitudeBetweenAndLongitudeBetween(long a, long b, long c, long d);
}