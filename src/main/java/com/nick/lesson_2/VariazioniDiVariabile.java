package com.nick.lesson_2;

public class VariazioniDiVariabile {


    public static void main(String[] args) {
        double tassoDiConversione = 1.1;
        System.out.println("Valore attuale del tasso di conversione: " + tassoDiConversione);

        tassoDiConversione = 1.3;
        System.out.println("Valore attuale del tasso di conversione: " + tassoDiConversione);

        tassoDiConversione = -0.3;
        System.out.println("Valore attuale del tasso di conversione: " + tassoDiConversione);

        System.out.println(sommaConversioni(1.1, 3.4));

        System.out.println(sommaConversioni(5.2, 4.5));

    }

    private static double sommaConversioni(double tassoDiConversione1, double tassoDiConversione2) {

        return tassoDiConversione1 + tassoDiConversione2;
    }
}
