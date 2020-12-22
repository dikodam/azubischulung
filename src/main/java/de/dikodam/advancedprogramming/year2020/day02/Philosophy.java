package de.dikodam.advancedprogramming.year2020.day02;

public class Philosophy {

    private final int min;
    private final int max;
    private final char character;

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
        return false;
    }
}
