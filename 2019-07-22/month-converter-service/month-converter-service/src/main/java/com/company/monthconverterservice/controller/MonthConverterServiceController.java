package com.company.monthconverterservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class MonthConverterServiceController {

    @RequestMapping(value = "/monthConverter/{input}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public int echo(@PathVariable int input) {
        if (input < 1 || input > 12) {
            throw new IllegalArgumentException("Input must be between 1 and 12.");
        }

        return input;
    }
}
