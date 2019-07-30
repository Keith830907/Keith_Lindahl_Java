package com.company.Lindahl_Keith_Summative4.controller;

import com.company.Lindahl_Keith_Summative4.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController {

    private Word[] words = {
            new Word(0, "dangerous", "adj. able or likely to cause harm or injury."),
            new Word(1, "control", "noun. a means of limiting or regulating something."),
            new Word(2, "keep", "verb. have or retain possession of."),
            new Word(3, "deal", "verb. cope with (a difficult person or situation)."),
            new Word(4, "love", "noun. an intense feeling of deep affection."),
            new Word(5, "friend", "noun. a person who is not an enemy or who is on the same side."),
            new Word(6, "fierce", "adj. showing a heartfelt and powerful intensity."),
            new Word(7, "fun", "noun. playful behavior or good humor."),
            new Word(8, "free", "adj. able or permitted to take a specified action."),
            new Word(9, "truth", "noun. that which is true or in accordance with fact or reality."),
    };

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord() {

        Random rand = new Random();

        return words[rand.nextInt(10)];
    }
}

