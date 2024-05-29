package com.nick.lesson_2.punto;

public class Punto {
    public int x;
    public int y;

    public Punto() {}

    public Punto(int a, int b) {
        x = a;
        y = b;
        System.out.println("Costruito un Punto con cordinate: x: " + x + " y: " + y);
    }
}
