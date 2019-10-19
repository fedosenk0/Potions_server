package ru.maveri.potions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.maveri.potions.JDBC.DAO.Interface.CoordinateDAORepo;
import ru.maveri.potions.JDBC.DAO.Interface.ImageDAORepo;
import ru.maveri.potions.JDBC.DAO.Interface.UserDAORepo;
import ru.maveri.potions.model.Coordinate;
import ru.maveri.potions.model.Recipe;
import ru.maveri.potions.model.join.table.UserPotion;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Value("${file.path}")
    private String staticImagePath;

    /*private UserRepo userRepo;
    private CoordinateRepo coordinateRepo;
    private ImageRepo imageRepo;


    @Autowired
    public UserService(UserRepo userRepo, ImageRepo imageRepo, CoordinateRepo coordinateRepo) {
        this.userRepo = userRepo;
        this.imageRepo = imageRepo;
        this.coordinateRepo = coordinateRepo;
    }*/

    private CoordinateDAORepo coordinateRepo;
    private UserDAORepo userRepo;
    private ImageDAORepo imageRepo;

    @Autowired
    public UserService(CoordinateDAORepo coordinateRepo, UserDAORepo userRepo, ImageDAORepo imageRepo) {
        this.coordinateRepo = coordinateRepo;
        this.userRepo = userRepo;
        this.imageRepo = imageRepo;
    }

    public List<Long> getImageId(Long id) {
        List<UserPotion> tempList;
        List<Long> idList = new ArrayList<>();
        tempList = userRepo.findById(Long.valueOf(1)).get().getPotions();
        for (UserPotion z : tempList) {
            idList.add(z.getImageUrl().getId());
        }
        return idList;
    }

    public void getImageById(int id, HttpServletResponse response) throws IOException {
        String partOfURL;
        partOfURL = String.valueOf(imageRepo.findById(Long.valueOf(id)).get().getUrl());
        response.setContentType("Image");
        Path imagePath = Path.of(staticImagePath + partOfURL);
        Files.copy(imagePath, response.getOutputStream());
    }

    public List<UserPotion> getPotions() {
        return userRepo.findById((long) 1).get().getPotions();
    }

    public List<Coordinate>getCoordinates(long id, long radius) {
        Coordinate coordinate = userRepo.findById(id).get().getCoordinate();
        List<Coordinate> coordinateList = coordinateRepo.findByLatitudeBetweenAndLongitudeBetween(coordinate.getLatitude() - radius,
                coordinate.getLatitude() + radius, coordinate.getLongitude() - radius, coordinate.getLongitude() + radius);
        if (coordinateList.contains(coordinate)) {
            coordinateList.remove(coordinate);
        }
        return coordinateList;
    }

    public Map<String, String> getRecipe(long id) {
        Map<String, String> recipeMap = new HashMap<>();
        List<Recipe> recipe = userRepo.findById(id).get().getRecipes();
        /*recipeMap.put("Первое зелье", recipe.getFirstPotionName());
        recipeMap.put("Второе зелье", recipe.getSecondPotionName());
        recipeMap.put("Третье зелье", recipe.getResultPotionName());*/
        //return userRepo.findById(id).get().getRecipes();
        //return recipeMap;
        for (Recipe z : recipe) {
            recipeMap.put("Первое зелье", z.getFirstPotionName());
            recipeMap.put("Второе зелье", z.getSecondPotionName());
            recipeMap.put("Третье зелье", z.getResultPotionName());
        }
        return recipeMap;
    }
}