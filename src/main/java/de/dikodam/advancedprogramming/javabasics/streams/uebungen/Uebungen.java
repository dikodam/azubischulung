package de.dikodam.advancedprogramming.javabasics.streams.uebungen;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Uebungen {


    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        // in einem Stream<Integer> :  finde alle geraden zahlen

        // in einem Stream<Integer> :  bestimmte das quadrat aller zahlen

        // in einem Stream<Integer> :  bestimme die anzahl aller ungeraden zahlen

        // in einem Stream<Integer> :  bestimme das quadrat aller zahlen, die größer/gleich 10 sind

        // bonus forschungsaufgabe: anzahl der einzigartigen ( = unique) elemente in einem stream


    }

    public static List<Integer> geradeZahlen(Stream<Integer> input) {
        return input
                .filter(i -> i % 2 == 0)
                .collect(toList());
    }

    public static List<Integer> quadratAllerZahlen(Stream<Integer> input) {
        return input
                .map(i -> i * i)
                .collect(toList());
    }

    public static int anzahlUngerade(Stream<Integer> input) {
        return (int) input
                .filter(i -> i % 2 != 0)
                .count();
    }

    public static List<Integer> quadratAllerZahlenGroesserGleichZehn(Stream<Integer> input) {
        return input
                .filter(i -> i >= 10)
                .map(i -> i * i)
                .collect(toList());
    }

    public static int anzahlUnique(Stream<Integer> input) {
        return (int) input
                .distinct()
                .count();
    }

}
