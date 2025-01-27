package sysout.eurekacourse.zoo.dao;


import org.springframework.stereotype.Repository;
import sysout.eurekacourse.zoo.model.Animal;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Repository
public class AnimalDao {

    private final Random random = new Random();


    private final List<Animal> list = Arrays.asList(
            new Animal("cat"), new Animal("dog"), new Animal("fox")
    );

    public Animal random() {
        return list.get(random.nextInt(list.size()));
    }
}
