package com.company.weatherservice.controller;
import com.company.weatherservice.model.Temperature;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
public class TemperatureController {

    @RequestMapping(value = "/temperature", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Temperature createWeatherTempAPI(@RequestBody @Valid Temperature temperature){


        return temperature;
    }
}