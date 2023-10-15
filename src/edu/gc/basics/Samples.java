package edu.gc.basics;

public class Samples {
    public static void main(String[] args) {
        printEvensOrOdds(1);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println(); //pusty sout przechodzi do kolejnej linii
        }

        printStars(8);
    }

    //wyświetlamy liczby parzyste lub nieparzyste dla zakresu do 10
    public static void printEvensOrOdds(int startIndex) {
        for(int i = 1; i <= 10; i=i+2) {
            System.out.println("i: " + i);
        }
    }

    public static void printStars(int startIndex) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println(); //pusty sout przechodzi do kolejnej linii
        }
    }
}