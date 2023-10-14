package edu.gc.basics;

public class Loops {

    /**
     * Pętle:
     * - for
     * - for each
     * - while
     * - do while
     */

    public static void main(String[] args) {

        // powtórz zadaną ilość razy
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        //for each przerobimy sobie przy okazji tablic albo kolekcji

        // powtórz dopóki warunek jest spełniony
        // może się zdarzyć że pętla się nie wykona ani razu jeśli warunek nie jest spełniony np j = 30
        int j = 0; //jakiś warunek musi być spełniony, żeby pętla się zaczęła się wykonywać
        while (j < 10) { //dopóki j < 10 to wykonuj pętlę
            System.out.println("j: " + j);
            j++;
        }

        // powtórz dopóki warunek jest spełniony
        // zawsze wykona się przynajmniej raz
        int k = 30;
        System.out.println(" przed pętlą k: " + k);
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 10); //wróć na początek pętli jeśli k < 10

        // break - przerwij pętlę
        // continue - pomiń aktualną iterację i przejdź do następnej
        System.out.println("Jak działa break i continue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; //pomiń aktualną iterację i przejdź do następnej
            }
            if (i == 8) {
                break; //przerwij pętlę
            }
            System.out.println("i: " + i);
        }
    }
}
