package Upgrade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Person {
    private String name = "Alan1";
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Alan");
        Person person1 = new Person("Sosed");
        Person person2 = new Person("Drug");
        Person person3 = new Person("Friend");
        List<Person> personsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        personsList.add(person1);
        personsList.add(person);
        personsList.add(person2);
        personsList.add(person3);
        personsList.forEach((n) -> n.setName(scanner.nextLine()));
        personsList.forEach((n) -> System.out.println(n.getName()));
    }
}
