package de.dikodam.advancedprogramming.javabasics.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static de.dikodam.advancedprogramming.javabasics.streams.Gender.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class OhBoi {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person(15, MALE, "Hans"),
                new Person(25, MALE, "Daniel"),
                new Person(29, MALE, "Adam"),
                new Person(28, FEMALE, "Su"),
                new Person(17, FEMALE, "Alexandra"),
                new Person(23, DIVERS, "Charlie"));


        // alle minderjäjrigen personen
        List<Person> underaged = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() <= 18) {
                underaged.add(person);
            }
        }


        // LAMBDA: person -> person.getAge() <= 18
        List<Person> underaged2 = filter(persons, person -> person.getAge() <= 18);

        System.out.println("underaged: ");
        printList(underaged2);
        System.out.println("");


        List<Person> notMales = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender() != Gender.MALE) {
                notMales.add(person);
            }
        }


        List<Person> notMales2 = filter(persons, person -> person.getGender() != MALE);
        System.out.println("not males: ");
        printList(notMales2);
        System.out.println("");

        // alle personen, deren name mit A anfängt
        List<Person> nameStartsWithAPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().startsWith("A")) {
                nameStartsWithAPersons.add(person);
            }
        }
        List<Person> namesStartWithA1 = filter(persons, person -> person.getName().startsWith("A"));
        System.out.println("names start with A");
        printList(namesStartWithA1);


        List<String> obst = Arrays.asList("apfel", "birne", "ananas");

        List<String> obstStartingWithA = filter(obst, einObst -> einObst.startsWith("a"));
        printList(obstStartingWithA);

        List<String> personsNamesEndingWithM = persons
                .stream()
                .filter(person -> person.getAge() >= 18) // alle volljährigen personen
                .map(person -> person.getName()) // abbildung: person -> name // namen aller volljährigen personen
                .collect(toList()); // in liste sammeln


        System.out.println("stream forEach:");
        persons
                .stream()
                .filter(person -> person.getAge() >= 18)    // alle volljährigen personen
                .map(person -> person.getName())                       // abbildung: person -> name // namen aller volljährigen personen
                .forEach(System.out::println);



//        System.out.println("namen aller volljährigen personen: ");
//        printList(personsNamesEndingWithM);


    }

    public static <T> List<T> filter(List<T> dinger, Condition<T> condition) {
        List<T> zwischenliste = new ArrayList<>();
        for (T ding : dinger) {
            if (condition.checkDing(ding)) {
                zwischenliste.add(ding);
            }
        }
        return zwischenliste;
    }

    public static void printList(List<?> liste) {
        for (Object o : liste) {
            System.out.println(o.toString());
        }
    }


}
