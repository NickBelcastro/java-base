package com.nick.lesson_2.auto;

public class TestOggettiAuto {
    public static void main(String[] args) {
        Auto fiat = new Auto();
        fiat.modello = "600";
        fiat.cilindrata = 1100;
        fiat.accelera();

        Auto ferrari = new Auto();
        ferrari.cilindrata = 4300;
        ferrari.accelera();

        Auto.mappa(fiat, 10000);
    }
}
