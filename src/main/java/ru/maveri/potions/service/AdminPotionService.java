package ru.maveri.potions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.repo.PotionRepo;

@Service
public class AdminPotionService {

    @Autowired
    private PotionRepo potionRepo;


    public Potion addNewPotion(Potion potion) {
        return potionRepo.save(potion);
    }
}
