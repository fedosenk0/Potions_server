package ru.maveri.potions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.maveri.potions.model.User;
import ru.maveri.potions.model.join.table.PotionImage;
import ru.maveri.potions.repo.ImageRepo;
import ru.maveri.potions.repo.UserRepo;

import java.util.*;

@Service
public class UserService {


    private UserRepo userRepo;

    private ImageRepo imageRepo;

    @Autowired
    public UserService(UserRepo userRepo, ImageRepo imageRepo) {
        this.userRepo = userRepo;
        this.imageRepo = imageRepo;
    }

    public List<Long> getImageId(Long id){
        List<PotionImage> tempList;
        List<Long> idList = new ArrayList<>();
        tempList = userRepo.findById(Long.valueOf(1)).get().getPotions();
        for (PotionImage z:tempList) {
            idList.add(z.getImageUrl().getId());
        }
        return idList;
    }

    public String getImageById(int id){
        String.valueOf(imageRepo.findById(Long.valueOf(id)).get().getUrl());

        return null;
    }
}
