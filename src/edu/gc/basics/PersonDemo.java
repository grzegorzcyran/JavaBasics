package edu.gc.basics;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person(); // tworzymy obiekt klasy Person za pomocą konstruktora domyślnego
        person.setName("Zosia");
        person.setSurname("Kowalska");
        person.setAge(20);
        person.setGender("K");
        System.out.println("person: " + person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getGender());

        System.out.println("+==================================+");
        Person person1 = new Person("Jan", "Kowalski", 30, "M"); // tworzymy obiekt klasy Person za pomocą konstruktora z argumentami
        System.out.println("person1: " + person1.getName() + " " + person1.getSurname() + " " + person1.getAge() + " " + person1.getGender());

    }
}
