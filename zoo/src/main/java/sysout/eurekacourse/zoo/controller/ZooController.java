package sysout.eurekacourse.zoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sysout.eurekacourse.zoo.model.Animal;

@RestController
public class ZooController {

    private final FeignClientController randomAnimalClient;

    @Autowired
    public ZooController(FeignClientController randomAnimalClient) {
        this.randomAnimalClient = randomAnimalClient;
    }

    @GetMapping("/animals/any")
    ResponseEntity<Animal> seeAnyAnimal(){
        return ResponseEntity.ok()
                .header("OData-EntityId", String.valueOf(1))
                .body(randomAnimalClient.randomAnimal());
    }
}
