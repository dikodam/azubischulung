package de.dikodam.advancedprogramming.year2017.day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class Day02Test {

    @Test
    void inputToLists() {
        // 1: Input und Vorbereitung:
        String input = "5\t1\t9\t5\n" +
                "7\t5\t3\n" +
                "2\t4\t6\t8";

        // 2. Testaufruf:
        List<List<Integer>> ergebnis = Day02.inputToLists(input);

        // 3. Erwartungen und Ergebnisse prüfen:
        String erwarteteListeAlsString = "[[5, 1, 9, 5], [7, 5, 3], [2, 4, 6, 8]]";

        assertThat(ergebnis.toString()).isEqualTo(erwarteteListeAlsString);
    }

    @Test
    void testDifferenzMaxMin() {
        // 1: Setup input
        List<Integer> numbers = asList(1, 2, 3, 5);

        // 2. execute test
        int result = Day02.differenzMaxMin(numbers);

        // 3. verify results
        assertThat(result).isEqualTo(4);
    }

    @Test
    void listenVerleich() {
        List<Integer> ersteListe = asList(1, 2);
        List<Integer> zweiteListe = asList(1, 2);

//        System.out.println(ersteListe.equals(zweiteListe));

        String a = "a";
        String b = "a";

        System.out.println(a == b);

    }

    @Test
    void isEvenlyDivisible_true() {
        //1. Setup input
        int a = 9;
        int b = 3;
        //2. execute Test
        boolean result = Day02.isEvenlyDivisible(a, b);
        //3. verify results
        assertThat(result).isTrue();
    }

    @Test
    void isEvenlyDivisible_false() {
        //1. Setup input
        int a = 9;
        int b = 4;
        //2. execute Test
        boolean result = Day02.isEvenlyDivisible(a, b);
        //3. verify results
        assertThat(result).isFalse();
    }


    @ParameterizedTest(name = "divide {0} and {1} should result in {2}")
    @MethodSource("getParametersForDivideTest")
    void divideParametrized(int a, int b, int expectedResult) {

        // step 2: execute test
        int result = Day02.divide(a, b);

        // step 3: verify result
        assertThat(result).isEqualTo(expectedResult);

    }

    static Stream<Arguments> getParametersForDivideTest() {
        return Stream.of(
                Arguments.of(2, 6, 3),
                Arguments.of(5, 10, 2),
                Arguments.of(7, 49, 7),
                Arguments.of(6, 36, 6)
        );
    }

}