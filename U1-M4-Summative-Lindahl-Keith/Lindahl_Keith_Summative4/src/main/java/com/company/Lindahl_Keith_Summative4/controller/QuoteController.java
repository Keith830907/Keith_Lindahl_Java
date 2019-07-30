package com.company.Lindahl_Keith_Summative4.controller;

import com.company.Lindahl_Keith_Summative4.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class QuoteController {

    private Quote[] quotes = {
            new Quote(0, "Dr. Suess", "Don't cry because it's over, smile because it happened."),
            new Quote(1, "Oscar Wilde", "Be yourself; everyone else is already taken."),
            new Quote(2, "Albert Einstein", "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe."),
            new Quote(3, "Bernard M. Baruch", "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind."),
            new Quote(4, "Mae West", "You only live once, but if you do it right, once is enough."),
            new Quote(5, "Mahatma Gandhi", "Be the change that you wish to see in the world."),
            new Quote(6, "Eleanor Roosevelt", "No one can make you feel inferior without your consent."),
            new Quote(7, "Mark Twain", "If you tell the truth, you don't have to remember anything."),
            new Quote(8, "Oscar Wilde", "Always forgive your enemies; nothing annoys them so much."),
            new Quote(9, "Oscar Wilde", "To live is the rarest thing in the world. Most people exist, that is all.")
    };

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {

        Random rand = new Random();

        return quotes[rand.nextInt(10)];
    }
}

