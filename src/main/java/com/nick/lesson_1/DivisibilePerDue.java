package com.nick.lesson_1;

import java.util.Scanner;

public class DivisibilePerDue {
    public static void main(String[] args) {
        System.out.println("Ciao, inserisci un numero e ti dirò se è divisibile per due.");
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int input = keyboardScanner.nextInt();

        if (input%2 == 0) {
            System.out.println("Il numero: " + input + " è divisibile per due.");
        } else {
            System.out.println("Il numero: " + input + " non è divisibile per due.");
        }
    }
}
