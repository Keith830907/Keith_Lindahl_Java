package com.company.Lindahl_Keith_Summative4.controller;

import com.company.Lindahl_Keith_Summative4.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
public class MagicController {

    private String[] answers = {
            "It is For sure going to happen.",
            "It is so likely.",
            "try again.Think harder",
            "Ask again at a later time.",
            "Don't count on it.",
            "Doesn't look so good."
    };

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer getAnswer(@RequestBody @Valid Answer question) {

        Random rand = new Random();


        question.setId(rand.nextInt(1000));
        question.setAnswer( answers[rand.nextInt(6)]);


        return question;
    }
}

