package com.nick.lesson_1;

import java.util.Scanner;

public class DividiDueInteri {
    public static void main(String args[]) {
        System.out.println("Ciao, so dividere due numeri interi.");
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("Scrivi il primo valore e premi invio");
        int input1 = keyboardScanner.nextInt();

        System.out.println("Scrivi il secondo valore e premi invio");
        int input2 = keyboardScanner.nextInt();

        System.out.println("Il risultato è: " + input1 / input2);
    }
}
