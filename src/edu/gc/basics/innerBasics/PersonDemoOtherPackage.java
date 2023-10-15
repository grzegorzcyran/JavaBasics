package edu.gc.basics.innerBasics;

//ponieważ klasa Person jest w innym pakiecie niż PersonDemoOtherPackage, to musimy ją zaimportować
import edu.gc.basics.Person;

public class PersonDemoOtherPackage {
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
        Person person2 = new Person();
        person2.age = 25;
        person2.setName("Walenty");
        person2.setGender("M"); //inny pakiet więc nie ma dostępu bezpośrednio do pola
        person2.setSurname("Nowak");
        System.out.println("person2: " + person2.getName() + " " + person2.getSurname() + " " + person2.age + " " + person2.getGender());
    }
}
