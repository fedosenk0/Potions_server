package ru.maveri.potions.controller.admin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.service.AdminImageService;
import ru.maveri.potions.service.AdminPotionService;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("admin/potion")
@CrossOrigin(origins = "http://localhost:8081")
public class PotionController {


    @Autowired
    private AdminPotionService potionService;

    @Autowired
    private AdminImageService imageService;

    @PostMapping
    public Potion addPotion(@RequestBody Potion potion){
        return potionService.addNewPotion(potion);

    }

    @PostMapping("{id}/image")
    public void addImage(@PathVariable long id, MultipartHttpServletRequest request)  {

        potionService.addImages(id,request);

    }
}
