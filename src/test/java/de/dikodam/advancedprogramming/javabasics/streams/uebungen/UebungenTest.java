package de.dikodam.advancedprogramming.javabasics.streams.uebungen;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class UebungenTest {

    // in einem Stream<Integer> :  finde alle geraden zahlen
    @Test
    void geradeZahlen() {
        Stream<Integer> input = getStream();

        List<Integer> result = Uebungen.geradeZahlen(input);

        assertThat(result).containsExactly(6, 8, 10, 14, 14);
    }

    // in einem Stream<Integer> :  bestimmte das quadrat aller zahlen
    @Test
    void quadratAllerZahlen() {
        Stream<Integer> input = getStream();

        List<Integer> result = Uebungen.quadratAllerZahlen(input);

        // TODO
        assertThat(result).containsExactly(36, 49, 64, 81, 100, 169, 169, 196, 196);
    }

    // in einem Stream<Integer> :  bestimme die anzahl aller ungeraden zahlen
    @Test
    void anzahlUngeraderZahlen() {
        Stream<Integer> input = getStream();

        int result = Uebungen.anzahlUngerade(input);

        assertThat(result).isEqualTo(4);
    }

    // in einem Stream<Integer> :  bestimme das quadrat aller zahlen, die größer/gleich 10 sind
    @Test
    void quadratAllerZahlenGroesserGleichZehn() {
        Stream<Integer> input = getStream();

        List<Integer> result = Uebungen.quadratAllerZahlenGroesserGleichZehn(input);

        assertThat(result).containsExactly(100, 169, 169, 196, 196);
    }


    // bonus forschungsaufgabe: anzahl der einzigartigen ( = unique) elemente in einem stream
    @Test
    void countUnique() {
        Stream<Integer> input = getStream();

        int result = Uebungen.anzahlUnique(input);

        assertThat(result).isEqualTo(7);
    }

    Stream<Integer> getStream() {
        return Stream.of(6, 7, 8, 9, 10, 13, 13, 14, 14);
    }

}