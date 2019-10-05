package ru.maveri.potions.controller.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.maveri.potions.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("image")
public class ImageController {

    UserService userService;

    @Autowired
    public ImageController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public List<Long> getIdImage(){
        List<Long> imageId = userService.getImageId((long) 1);
        return imageId;
    }

    @GetMapping(value = "/{id}")
    public String getImageById(@PathVariable int id, HttpServletResponse response){
        response.setContentType("Image");
        return userService.getImageById(id);
    }




}
