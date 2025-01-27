package sysout.eurekacourse.randomanimal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sysout.eurekacourse.randomanimal.dao.AnimalDao;
import sysout.eurekacourse.randomanimal.model.Animal;

@RestController
public class RandomAnimalController {

    private final AnimalDao animalDao;

    @Autowired
    public RandomAnimalController(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    @GetMapping("/random")
    public Animal randomAnimal() {
        return animalDao.random();
    }
}
