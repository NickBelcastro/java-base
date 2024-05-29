package com.nick.lesson_2.punto;

public class TestOggettiPunto {
    public static void main(String[] args) {
        // Dichiarazione
        Punto punto1;
        // Istanziazione
        punto1 = new Punto(2, 6);

        Punto punto2 = new Punto(0, 1);

        System.out.println("Punto 1: " + punto1.x + " " + punto1.y);
        System.out.println("Punto 2: " + punto2.x + " " + punto2.y);
    }
}
