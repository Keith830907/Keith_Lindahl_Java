package com.company.calculatorservice.controller;


import com.company.calculatorservice.model.Calculator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Calculator createAddCalculator(@RequestBody @Valid Calculator calculator){
        return calculator;
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Calculator createSubtractCalculator(@RequestBody @Valid Calculator calculator){
        return calculator;
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Calculator createMultiplyCalculator(@RequestBody @Valid Calculator calculator){
        return calculator;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Calculator createDivideCalculator(@RequestBody @Valid Calculator calculator){
        return calculator;
    }
}