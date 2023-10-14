package edu.gc.basics;

public class Instructions {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a == b) {
            System.out.println("a jest równe b");
        } else { //else jest opcjonalny
            System.out.println("a nie jest równe b");
        }

        if (a == b) {
            System.out.println("a jest równe b");
        } else if (a > b) {
            System.out.println("a jest większe od b");
        } else {
            System.out.println("a jest mniejsze od b");
        }

        a = 2;
        switch (a) {
            case 1:
                System.out.println("a jest równe 1");
                break;
            case 2:
                System.out.println("a jest równe 2");
                break; // nie musi być break, ale wtedy wykonają się wszystkie instrukcje poniżej
            default:
                System.out.println("a jest inne niż 1 i 2");
        }

        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        a = 6;
        System.out.println("a: " + a);
        // switch w wersji Java14
        switch (a) {
            case 1 -> System.out.println("a jest równe 1"); // sprawdzamy czy a ==1, jeśli tak to wykonujemy instrukcję po ->
            case 2 -> System.out.println("a jest równe 2"); // sprawdzamy czy a ==2, jeśli tak to wykonujemy instrukcję po ->
            default -> System.out.println("a jest inne niż 1 i 2"); // jeśli żaden z case nie pasuje to wykonujemy instrukcję po ->
        }
    }

    /**
     * Instrukcje warunkowe:
     * - if
     * - if else
     * - if else if else
     * - switch
     */
}
