package com.company.dayconverterservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class DayConverterServiceController {

    @RequestMapping(value = "/dayConverter/{input}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public int echo(@PathVariable int input) {
        if (input < 1 || input > 7) {
            throw new IllegalArgumentException("Input must be between 1 and 7.");
        }

        return input;
    }
}

