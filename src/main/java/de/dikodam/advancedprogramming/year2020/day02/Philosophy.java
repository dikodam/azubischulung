package de.dikodam.advancedprogramming.year2020.day02;

public class Philosophy {

    // "1-3 a: abcde"

    private final int min; // 1
    private final int max; // 3
    private final char character; // a

    public Philosophy(int min, int max, char character) {
        this.min = min;
        this.max = max;
        this.character = character;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public char getCharacter() {
        return character;
    }

    public boolean validate(Password password) {
        String text = password.getPassword(); // "abcde"
        int charCount = 0;

        // passwort durchgehen
        // einzelne zeichen überprüfen, ob sie mit character übereinstimmen
        for (int i = 0; i < text.length(); i++) {
            char buchstabe = text.charAt(i);
        // wenn sie übereinstimmen, dann charCount hochzählen
            if (buchstabe == character) {
                charCount += 1;
            }
        }
        // prüfen, ob charCount zwischen min und max length
        return charCount >= min && charCount <= max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Philosophy that = (Philosophy) o;

        if (min != that.min) return false;
        if (max != that.max) return false;
        return character == that.character;
    }

    @Override
    public int hashCode() {
        int result = min;
        result = 31 * result + max;
        result = 31 * result + (int) character;
        return result;
    }
}
