package ru.maveri.potions.controller.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maveri.potions.model.Recipe;
import ru.maveri.potions.service.UserService;

import java.util.List;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    UserService userService;

    @Autowired
    public RecipeController(UserService userService) {
        this.userService = userService;
    }

    public List<Recipe> getRecepi() {
        long id = 1;
        return userService.getRecipe(id);
    }
}
