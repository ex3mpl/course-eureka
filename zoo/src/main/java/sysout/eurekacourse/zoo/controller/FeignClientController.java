package sysout.eurekacourse.zoo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import sysout.eurekacourse.zoo.dao.AnimalDao;
import sysout.eurekacourse.zoo.model.Animal;

@FeignClient(name = "random-animal")
public interface FeignClientController {

    AnimalDao animalDao = new AnimalDao();

    @GetMapping("/random")
    default Animal randomAnimal() {
        return animalDao.random();
    }

}
