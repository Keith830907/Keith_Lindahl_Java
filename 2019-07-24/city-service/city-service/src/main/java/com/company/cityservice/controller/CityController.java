package com.company.cityservice.controller;


import com.company.cityservice.model.City;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static javax.swing.UIManager.get;

@RestController
public class CityController {

    private List<City> cityList = new ArrayList<City>();

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public City addCity(@RequestBody @Valid City city) {
        cityList.add(city);

        return city;
    }



    @RequestMapping(value = "/city/{name}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteCity(@PathVariable String name) {

        int pos = 0;
        boolean found = false;

        for(City city : cityList) {
            if (city.getCityName().equalsIgnoreCase(name)) {
                found = true;
                break;
            }

            pos++;
        }

        if ( found )
            cityList.remove(pos);
        else throw new IllegalArgumentException("City object not found.");
    }




    @RequestMapping(value = "/city", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<City> getCities() {

        return cityList;
    }




    @RequestMapping(value = "/city/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public City getCity(@PathVariable String name) {

        for(City city : cityList) {
            if (city.getCityName().equalsIgnoreCase(name))
                return city;
        }

        throw new IllegalArgumentException("City object not found.");
    }

}
