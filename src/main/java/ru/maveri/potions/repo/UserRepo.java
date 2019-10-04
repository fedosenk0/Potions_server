package ru.maveri.potions.repo;

import org.springframework.data.repository.CrudRepository;
import ru.maveri.potions.model.User;

public interface UserRepo extends CrudRepository<User,Long> {


}
