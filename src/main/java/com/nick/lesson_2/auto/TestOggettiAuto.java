package com.nick.lesson_2.auto;

public class TestOggettiAuto {
    public static void main(String[] args) {
        Auto fiat = new Auto(1100, "600");
        fiat.accelera();

        Auto ferrari = new Auto(4300, "Testa rossa");
        ferrari.accelera();
        ferrari.cambioOlio();

        Auto.mappa(fiat, 10000);
        Auto.ruba(ferrari);
    }
}
