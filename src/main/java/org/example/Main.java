package org.example;

import org.example.controller.Controller;
import org.example.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gameChooseOption(startGame());


    }

    private static int startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 game is starting" +
                "\n2 game closing");
        return scanner.nextInt();
    }



    private static void  gameChooseOption(int num){
        Controller controller = new Controller();
        switch (num){
            case 1:
                controller.startApp();
                break;
            case 2:
                System.out.println("Thanks come again");
                break;
            default:
                System.out.println("Wroooonggg enter a number between 1 and 2 ");
                gameChooseOption(startGame());
                break;



        }
    }
}