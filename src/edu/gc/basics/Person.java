package edu.gc.basics;

/**
 * Klasy i obiekty w Javie
 * Klasa to szablon, wzór, schemat, z którego tworzymy obiekty.
 * Obiekt to instancja klasy czyli zbiór danych powiązanych.
 *
 */
public class Person {
    private String name;
    protected String surname;
    public int age;
    String gender; // domyślnie jest pakietową, czyli dostępną tylko w pakiecie
    // konstruktor domyślny - jeśli nie ma żadnego konstruktora, to kompilator automatycznie go dodaje
    //czasami jest wymagane dodanie go nawet jeśli są inne konstruktory bo wymaga tego jakaś biblioteka
    public Person() {
        System.out.println("Konstruktor domyślny");
        this.name = "Unknown";
        this.surname = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    //konstruktor to specjalna metoda, która ma taką samą nazwę jak klasa, nie ma typu zwracanego, może mieć argumenty
    //konstruktor jest wywoływany w momencie tworzenia obiektu
    public Person(String name, String surname, int age, String gender) {
        System.out.println("Konstruktor z argumentami");
        //this to słowo kluczowe, które oznacza obiekt, na którym wywołujemy metodę
        //czyli this.name oznacza pole name obiektu, na którym wywołujemy metodę
        //a name to argument metody, itd z kolejnymi polami i argumentami
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
