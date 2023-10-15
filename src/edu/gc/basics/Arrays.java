package edu.gc.basics;

/**
 * Tablice w Javie
 * Tablice zawierają zbiór elementów tego samego typu.
 * Tablice są obiektami.
 * Deklaracja tablicy:
 * typ[] nazwaTablicy = new typ[rozmiar];
 * typ[] nazwaTablicy = {element1, element2, element3};
 *
 *
 */
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // deklaracja tablicy 10 elementowej
        numbers[0] = 1; // przypisanie wartości do pierwszego elementu tablicy - indeks 0 zawsze oznacza pierwszy element
        numbers[1] = 2;
        numbers[2] = 3;
        //pozostałe elementy tablicy mają wartość domyślną dla typu int, czyli 0
        //wydrukowanie tablicy
        System.out.println("numbers: " + numbers); // [I@1b6d3586 jest identyfikatorem tej tablicy dla JVM (Java Virtual Machine)
        //wydrukowanie elementu tablicy
        System.out.println("numbers[0]: " + numbers[0]); // 1
        System.out.println("Drukujemy tablicę, wszystkie jej elementy po kolei:");
        System.out.println("Tam, gdzie nie przypisaliśmy wartości do elementu tablicy, będzie wartość domyślna, dla int = 0");
        //wydrukowanie wszystkich elementów tablicy po kolei:
        for(int i = 0; i < numbers.length; i++) { //length to pole, a nie metoda, określa rozmiar tablicy
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        grubaKrecha();
        numbers[5] = 18;
        numbers[6] = 19;
        numbers[2] = 20; // nadpisujemy wartość elementu tablicy
        //poniższa pętla to tzw "for each" - dla każdego elementu tablicy numbers wykonaj poniższy blok kodu
        for (int number : numbers) { //number to zmienna, którą deklarujemy w tej pętli, która będzie przechowywać wartość kolejnych elementów tablicy
            System.out.println("number: " + number);
        }
    }

    private static void grubaKrecha() {
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
    }
}
