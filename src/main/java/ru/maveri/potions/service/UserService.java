package ru.maveri.potions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.model.join.table.PotionImage;
import ru.maveri.potions.repo.ImageRepo;
import ru.maveri.potions.repo.UserRepo;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class UserService {

    @Value( "${file.path}" )
    private String staticImagePath;

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

    public void getImageById(int id, HttpServletResponse response) throws IOException {
        String partOfURL;
        partOfURL = String.valueOf(imageRepo.findById(Long.valueOf(id)).get().getUrl());
        response.setContentType("Image");
        Path imagePath =  Path.of(staticImagePath+partOfURL);
        Files.copy(imagePath,response.getOutputStream());
    }

}
