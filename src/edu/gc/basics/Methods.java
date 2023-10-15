package edu.gc.basics;

/**
 * Metody - funkcje w Javie
 * - metoda może zwracać wartość lub nie, wartość może być dowolnego typu, również tablice, obiekty, itd
 * - metoda może przyjmować argumenty lub nie, argumenty mogą być dowolnego typu, również tablice, obiekty, itd, ale im więcej argumentów tym gorzej, bo metoda przestaje być czytelna
 *
 * - metoda może być statyczna lub nie
 * - metoda może być publiczna lub nie, dozwolone są wszelkie modyfikatory dostępu
 *
 * Definicja metody:
 * [modyfikator dostępu] [typ zwracany] [nazwa metody] ([lista argumentów]) {
 *    [ciało metody]
 *    [return wartość;] - opcjonalnie
 *    [return;] - opcjonalnie
 *  }
 */
public class Methods {

    //dwa argumenty: a i b
    //typ zwracany: int
    private static int add(int a, int b) {
        int innerResult = a + b; // zmienna lokalna, dostępna tylko wewnątrz tej metody
        //zmienna lokalna innerResult tak naprawdę jest niepotrzebna, można było od razu zwrócić a + b
        //tak jest lepiej, bo mamy mniej kodu, w ten sposób jest zrobiona metoda multiply
        return innerResult;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    // jeden argument String
    // typ zwracany: void czyli NIC, ta metoda nic nie zwraca, ale Java wymaga w takim przypadku określenia void
    private static void print(String message) {
        System.out.println("Dostałam do wyświetlenia: " + message);
        //metoda która nic nie zwaraca, może zawierać return, ale wtedy musi być bez argumentu
        //ewentualnie nie musi być return wcale - tak jest najczęściej
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = add(a, b); // wywołanie metody add, przekazanie do niej argumentów a i b, zapisanie wyniku w zmiennej result
        print("Wynik dodawania: " + result); // wywołanie metody print, przekazanie do niej argumentu "Wynik dodawania: " + result

        print("Wynik mnożenia: " + multiply(6,8)); // wywołanie metody print, przekazanie do niej wyniku metody multiply

        // metoda main też nic nie zwraca, dlatego jest void
    }

    // metoda która nie przyjmuje żadnych argumentów i nic nie zwraca
    private static void printHelloWorld() {
        System.out.println("Hello world!");
    }

    // metoda która nie przyjmuje żadnych argumentów i zwraca String
    private static String getHelloWorld() {
        return "Hello world!";
    }

}
