package com.company.Dogs.controller;

import com.company.Dogs.model.Dog;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DogController {

    private List<Dog> dogList = new ArrayList<Dog>();

    @RequestMapping(value = "/dog", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Dog addDog(@RequestBody @Valid Dog dog) {
        Random r = new Random();

        dog.setId(r.nextInt(9999));
        dogList.add(dog);
        System.out.println("Added Dog with the name of: " + dog.getName());
        return dog;

    }



    @RequestMapping(value = "/dog/{name}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteDog(@PathVariable String name) {

        int pos = 0;
        boolean found = false;

        for(Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                found = true;
                break;
            }

            pos++;
        }

        if ( found )
            dogList.remove(pos);
        else throw new IllegalArgumentException("Dog object not found.");
        System.out.println("Deleted Dog with the name of: " + name);
    }




    @RequestMapping(value = "/dog", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Dog> getDogs() {

        return dogList;
    }




    @RequestMapping(value = "/dog/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Dog getDog(@PathVariable String name) {

        for(Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name))
                return dog;
        }
        System.out.println("Retrieved Dog with the name of: " + name);
        throw new IllegalArgumentException("Dog object not found.");

    }

    @RequestMapping(value = "/dog/{Id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDog(@RequestBody @Valid Dog dog, @PathVariable int Id) {
        if (Id != dog.getId()) {
            throw new IllegalArgumentException("Dog ID on path must match the ID in the Dog object.");
        }
        System.out.println("Updated dog with the id of: " + Id);
    }

}
