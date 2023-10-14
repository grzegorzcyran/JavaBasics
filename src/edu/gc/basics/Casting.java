package edu.gc.basics;

/**
 * Casting czyli rzutowanie czyli konwersja typów.
 * Czyli zmiana jednego typu na inny.
 * W Javie mamy dwa rodzaje rzutowania:
 * - jawne - wymuszone przez programistę
 * - niejawne - automatyczne
 *
 * Rzutowanie jawne:
 * - konwersja z typu większego do mniejszego
 * - konwersja z typu mniejszego do większego
 * - konwersja z typu zmiennoprzecinkowego do całkowitego
 * - konwersja z typu całkowitego do zmiennoprzecinkowego
 *
 * Rzutowanie niejawne:
 * - konwersja z typu całkowitego do zmiennoprzecinkowego
 * - konwersja z typu zmiennoprzecinkowego do całkowitego
 * - konwersja z typu większego do mniejszego
 *
 */
public class Casting {

        public static void main(String[] args) {
            int a = 1;
            double b = 2.5; // to wcale nie musi być 2.5, może być 2.4999989999
            double c = a; // niejawne
            int d = (int) b; // jawne, wymuszone przez programistę

            long e = 1L; // wygląda jak int, ale jest long, bo ma L na końcu
            System.out.println("a: " + a); // 1
            System.out.println("b: " + b); // 2.0
            System.out.println("c: " + c); // 1.0
            System.out.println("d: " + d); // 2

            //zmiana wartości w longu
            e = 2147483648L; // 2^31
        }
}
