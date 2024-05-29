package com.nick.lesson_2.auto;

public class Auto {
    public final int NUMERO_RUOTE = 4;
    public int cilindrata;
    public String modello;

    public void accelera() {
        System.out.println("Sto accelerando con cilindrata: " +  cilindrata);
    }

    public static void mappa(Auto auto, int nuovaCilindrata) {
        System.out.println("Sto modificando la centralina dell'auto: " + auto.modello);
        auto.cilindrata = nuovaCilindrata;
        System.out.println("La nuova cilindrata è: " +  nuovaCilindrata);
    }
}
