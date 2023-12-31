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

        System.out.println("+==================================+");
        Person person2 = new Person(); // tworzymy obiekt klasy Person
        person2.gender = "M";
        person2.setName("Zbigniew"); //name jest private więc nie można się do niego dostać bezpośrednio, trzeba przez metodę
        person2.surname = "Nowak";
        person2.age = 30;
        System.out.println("person2: " + person2.getName() + " " + person2.surname + " " + person2.age + " " + person2.gender);
    }
}
