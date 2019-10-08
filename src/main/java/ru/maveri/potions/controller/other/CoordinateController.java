package ru.maveri.potions.controller.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maveri.potions.model.Coordinate;
import ru.maveri.potions.service.UserService;

import java.util.List;

@RestController
@RequestMapping("coordinate")
public class CoordinateController {

    UserService userService;

    @Autowired
    public CoordinateController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping()
    public List<Coordinate> getCoordinate(){
        long id = 1;
       return userService.getCoordinates(id,10);
    }
}
