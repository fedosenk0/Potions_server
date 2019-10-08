package ru.maveri.potions.controller.other;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maveri.potions.model.Recipe;
import ru.maveri.potions.service.UserService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("recipe")
public class RecipeController {

    UserService userService;

    @Autowired
    public RecipeController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping()
    public Map<String,String> getRecepi() {
        long id = 1;
        return userService.getRecipe(id);
    }
}
