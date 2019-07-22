package com.company.weatherservice.controller;
import com.company.weatherservice.model.Conditions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
public class ConditionsController {
    @RequestMapping(value = "/conditions", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Conditions createWeatherConditionAPI(@RequestBody @Valid Conditions conditions){


        return conditions;
    }
}

