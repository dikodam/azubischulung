package de.dikodam.advancedprogramming.javabasics.streams;

public class Person {

    private int age;
    private Gender gender;
    private String name;

    public Person(int age, Gender gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
