package ru.maveri.potions.controller.other;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maveri.potions.model.Potion;
import ru.maveri.potions.model.join.table.UserPotion;
import ru.maveri.potions.service.UserService;

import java.util.List;

@RestController
@RequestMapping("potion")
public class PotionController {

    UserService userService;

    @Autowired
    public PotionController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public List<UserPotion> getUsersPotions(@PathVariable Long id){
        return userService.getPotions(id);

    }
}
