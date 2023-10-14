package edu.gc.basics;

/**
 * Klasa w której omówiemy sobie zmienne, czym są, jakie mamy typy zmiennych.
 * Opowiemy też o zasięgach zmiennych.
 */
public class Variables {

    /**
     * Zasięgi zmiennych (ale też metod i klas:
     *  - public - zmienna dostępna wszędzie
     *  - protected - zmienna dostępna w pakiecie oraz w klasach dziedziczących (o tym później)
     *  - package private (default) - zmienna dostępna w pakiecie
     *  - private - zmienna dostępna w klasie
     */

    public int publicVariable = 1; // dostępna wszędzie
    protected int protectedVariable = 2; // dostępna w pakiecie oraz w klasach dziedziczących (o tym później)
    int packagePrivateVariable = 3; // dostępna w pakiecie (czyli w edu.gc.basics, ale w edu.gc.basics.inner już nie)
    private int privateVariable = 4; // dostępna w klasie i tylko w niej

    /**
     * Stałe w Javie - słowo kluczowe final
     * Nie ma w Javie czegoś takiego jak stała (const) jak w C/C++.
     * W Javie mamy zmienne, które możemy oznaczyć jako final, co oznacza, że nie można ich zmienić.
     */
    public final int finalVariable = 5; // stała, nie można zmienić wartości

    /**
     * Najczęściej używane zastosowanie stałej to stałe globalne, które są dostępne wszędzie.
     */
    public final static int GLOBAL_CONSTANT = 6; // stała globalna, dostępna wszędzie

    /**
     * Konwencje nazewnicze:
     * camelCase - zaczynamy z małej litery, każde kolejne słowo zaczynamy z wielkiej litery getClientById - w Javie dla metod, pól
     * PascalCase - każde kolejne słowo zaczynamy z wielkiej litery GetClientById - w Javie dla klas
     * snake_case - wszystkie litery małe, słowa oddzielone podkreślnikiem get_client_by_id - w Javie dla stałych
     * kebab-case - wszystkie litery małe, słowa oddzielone myślnikiem get-client-by-id - w Javie nie używamy
     */

    /**
     * Typy zmiennych:
     * - liczby całkowite - byte, short, int, long
     * - liczby zmiennoprzecinkowe - float, double
     * - znaki - char
     * - wartości logiczne - boolean
     * - napisy - String - to już nie jest typ prosty tylko obiektowy, ale o tym później
     */

    byte byteVariable = 1; // 8 bitów, zakres od -128 do 127
    short shortVariable = 2; // 16 bitów, zakres od -32768 do 32767
    int intVariable = 3; // 32 bity, zakres od -2147483648 do 2147483647
    long longVariable = 4; // 64 bity, zakres od -9223372036854775808 do 9223372036854775807
    float floatVariable = 5.0f; // 32 bity, zakres od około 1.4e-45 do około 3.4e+38
    double doubleVariable = 6.0; // 64 bity, zakres od około 4.9e-324 do około 1.8e+308
    char charVariable = 'a'; // 16 bitów, zakres od 0 do 65535
    boolean booleanVariable = true; // 1 bit, zakres true lub false
    String stringVariable = "Hello world!"; // napis, czyli ciąg znaków, nie jest typem prostym, ale o tym później

    /**
     * Wartości domyślne zmiennych:
     * - liczby całkowite - 0
     * - liczby zmiennoprzecinkowe - 0.0
     * - znaki - '\u0000'
     * - wartości logiczne - false
     * - napisy - null
     */
    int sample; //domyslnie 0

    /**
     * Zmienne lokalne - zmienne zdefiniowane w metodzie, konstruktorze, bloku kodu
     * Zmienne lokalne muszą być zainicjalizowane przed użyciem.
     * Zmienne lokalne nie mają wartości domyślnej.
     * Zmienne lokalne nie mogą mieć modyfikatorów dostępu.
     * Zmienne lokalne nie mogą być statyczne.
     *
     * Zmienne globalne - zmienne zdefiniowane w klasie, ale nie w metodzie, konstruktorze, bloku kodu
     */

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Zmienne lokalne
        int localVariable = 1; // zmienna lokalna, dostępna tylko w metodzie main
        System.out.println(localVariable); // 1
        System.out.println(new Variables().publicVariable); // 1
        System.out.println(new Variables().protectedVariable); // 2
        System.out.println(new Variables().packagePrivateVariable); // 3
        System.out.println(new Variables().privateVariable); // 4
        System.out.println(new Variables().finalVariable); // 5
        System.out.println(GLOBAL_CONSTANT); // 6
        System.out.println(new Variables().sample); // 0
        System.out.println(new Variables().floatVariable); // 5.0
        System.out.println(new Variables().doubleVariable); // 6.0
        System.out.println(new Variables().charVariable); // a
        System.out.println(new Variables().booleanVariable); // true
        System.out.println(new Variables().stringVariable); // Hello world!

        System.out.println("====================================");
        System.out.println("====================================");
        specialCharacters();

    }

    //Komentarz - jednolinijkowy

    /*
    Komentarz - wielolinijkowy
     */

    /**
     * Komentarz - dokumentacyjny - służy do generowania dokumentacji
     */

    /**
     * Metoda zwracająca napis "Hello world!" z parametrami które dostanie na wejściu
     * @param param1 - parametr pierwszy
     * @param param2 - parametr drugi
     * @return - co zwraca metoda
     */
    public String getHelloWorldWithParams(String param1, String param2, int param3) {
        return "Hello world!";
    }

    /**
     * Generalnie kod powinniśmy pisać tak żeby był "samo dokumentujący się", czyli
     * nie powinniśmy komentować co robi kod, tylko pisać kod tak żeby był czytelny.
     * Nazwa metody powinna mówić co ta metoda będzie robić.
     * Nazwa zmiennej powinna mówić co ta zmienna będzie przechowywać.
     *
     * Unikamy nazw krótkich i niezrozumiałych, np.:
     * - x, y, z
     * Unikamy nazw złożonych z jednej litery i jednej cyfry, np.:
     *  - x1, y2, z3
     * Unikamy nazywania metod, pól, klas jako powtarzalnych, czyli np. mamy
     * metodę getBalance, to nie nazywamy drugiej getBalance2, tylko np. getBalanceForUser.
     */

    /**
     * Znaki specjalne do Stringa:
     * \n - nowa linia
     * \t - tabulator
     * \" - cudzysłów
     * \' - apostrof
     * \\ - backslash
     */
    public static void specialCharacters() {
        System.out.println("Hello\nworld!");
        System.out.println("Hello\tworld!");
        System.out.println("Hello\"world!\"");
        System.out.println("Hello\\world!\\");
    }
}
