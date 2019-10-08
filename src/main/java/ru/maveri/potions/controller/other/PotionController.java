package ru.maveri.potions.controller.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maveri.potions.model.join.table.UserPotion;
import ru.maveri.potions.service.UserService;

import java.util.List;

@RestController
@RequestMapping("potion")
public class PotionController {


    private UserService userService;

    @Autowired
    public PotionController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<UserPotion> getUsersPotions(){
        return userService.getPotions();

    }
}
