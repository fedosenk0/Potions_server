package ru.maveri.potions.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.maveri.potions.model.Potion;

public interface PotionRepo extends CrudRepository<Potion,Long> {


}
