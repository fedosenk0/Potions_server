package ru.maveri.potions.repo;

import org.springframework.data.repository.CrudRepository;
import ru.maveri.potions.model.ImageUrl;

public interface ImageRepo extends CrudRepository<ImageUrl,Long> {

}
