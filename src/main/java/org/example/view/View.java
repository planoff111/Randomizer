package org.example.view;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public String gedData(){
        System.out.println("Enter a word");
        String word = scanner.nextLine().toLowerCase();
        return word;
    }


}
