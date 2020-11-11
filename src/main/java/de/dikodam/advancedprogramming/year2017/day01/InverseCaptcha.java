package de.dikodam.advancedprogramming.year2017.day01;

import java.util.ArrayList;
import java.util.List;

public class InverseCaptcha {

    public static void main(String[] args) {

    }

    public static int calculateCaptcha(String input) {
        List<Integer> numbers = transformInput(input);

        int count = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentDigit = numbers.get(i);
            int nextDigit = numbers.get(i + 1);
            if (currentDigit == nextDigit) {
                count += currentDigit;
            }
        }

        return count;
    }

    public static List<Integer> transformInput(String input) {
        String[] numberStrings = input.split("");
        List<Integer> numbers = new ArrayList<>();

        for (String numberString : numberStrings) {
            numbers.add(Integer.valueOf(numberString));
        }

        return numbers;
    }
}
