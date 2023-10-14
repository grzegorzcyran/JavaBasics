package edu.gc.basics;

public class Operators {
    /**
     * Operatory arytmetyczne:
     * - dodawanie +
     * - odejmowanie -
     * - mnożenie *
     * - dzielenie /
     * - reszta z dzielenia %
     * - inkrementacja ++ prefixowa i postfixowa
     * - dekrementacja -- prefixowa i postfixowa
     */

    /**
     * Operatory przypisania:
     * - przypisanie =
     * - dodawanie i przypisanie +=
     * - odejmowanie i przypisanie -=
     * - mnożenie i przypisanie *=
     * - dzielenie i przypisanie /=
     * - reszta z dzielenia i przypisanie %=
     */

    /**
     * Operatory porównania:
     * - równe ==
     * - różne !=, alternatywnie <>
     * - większe >
     * - mniejsze <
     * - większe lub równe >=
     * - mniejsze lub równe <=
     */

    /**
     * Operatory logiczne:
     * - negacja !
     * - koniunkcja && - czyli "i"
     * - alternatywa || - czyli "lub"
     */

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b; // 3
        int d = a - b; // -1
        int e = a * b; // 2
        int f = a / b; // 0
        int g = a % b; // 1 - reszta z dzielenia inaczej modulo
        int h = ++a; // 2 - najpierw zwiększamy a o 1, potem przypisujemy do h
        int i = --a; // 1 - najpierw zmniejszamy a o 1, potem przypisujemy do i
        int j = a++; // 1 - najpierw przypisujemy do j, potem zwiększamy a o 1
        int k = a--; // 2 - najpierw przypisujemy do k, potem zmniejszamy a o 1
        System.out.println("a: " + a); // 1
        System.out.println("b: " + b); // 2
        System.out.println("c: " + c); // 3
        System.out.println("d: " + d); // -1
        System.out.println("e: " + e); // 2
        System.out.println("f: " + f); // 0
        System.out.println("g: " + g); // 1
        System.out.println("h: " + h); // 2
        System.out.println("i: " + i); // 1
        System.out.println("j: " + j); // 1
        System.out.println("k: " + k); // 2
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");

        int l = 1;
        l += 1; // l = l + 1;
        System.out.println("l: " + l); // 2
        l -= 1; // l = l - 1;
        System.out.println("l: " + l); // 1
        l *= 2; // l = l * 2;
        System.out.println("l: " + l); // 2
        l /= 2; // l = l / 2;
        System.out.println("l: " + l); // 1
        l %= 2; // l = l % 2;
        System.out.println("l: " + l); // 1
    }

}
