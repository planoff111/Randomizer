package org.example.controller;

import org.example.model.Model;
import org.example.view.View;

import java.util.Random;


public class Controller {

    private String randomizer() {
        Model entity = new Model();
        Random random = new Random();
        int randomIndex = random.nextInt(entity.words.length);
        String randomValue = entity.words[randomIndex];
        return randomValue;
    }


    private void handleData(String gues, String secret) {
        View view = new View();

        StringBuilder guesLetters = new StringBuilder("###############");
        boolean wordGuessed = false;
        while (!wordGuessed) {
            System.out.println("Word is " + guesLetters.toString());
            gues = view.gedData();
            boolean letterFound = false;

            for (int i = 0; i < secret.length(); i++) {
                if (i < gues.length() && gues.charAt(i) == secret.charAt(i)) {
                    guesLetters.setCharAt(i, secret.charAt(i));
                    letterFound = true;
                }
            }

            if (!letterFound) {
                System.out.println("Wrong Word");
            }

            if (secret.equals(guesLetters.toString().replace("#", ""))) {
                wordGuessed = true;
            }

            if (wordGuessed) {
                System.out.println("You guessed the word " + secret);
            }

        }

    }

    public void startApp(){
        View view = new View();
        handleData(view.gedData(), randomizer());
    }

}
