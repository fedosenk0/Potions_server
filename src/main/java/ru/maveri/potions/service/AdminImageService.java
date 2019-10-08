package ru.maveri.potions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import ru.maveri.potions.model.ImageUrl;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.repo.ImageRepo;
import ru.maveri.potions.repo.PotionRepo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class AdminImageService {



    private PotionRepo potionRepo;

    @Autowired
    public AdminImageService(PotionRepo potionRepo) {
        this.potionRepo = potionRepo;
    }


//    @Value("&{spring.dir}")
//    private  String direct;



}
