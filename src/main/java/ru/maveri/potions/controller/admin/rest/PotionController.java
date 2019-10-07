package ru.maveri.potions.controller.admin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.service.AdminPotionService;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("admin/potion")
public class PotionController {


    @Autowired
    private AdminPotionService potionService;

    @PostMapping
    public Potion addPotion(@RequestBody Potion potion){
        return potionService.addNewPotion(potion);

    }
}
