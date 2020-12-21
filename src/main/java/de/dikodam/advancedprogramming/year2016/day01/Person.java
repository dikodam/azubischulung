package de.dikodam.advancedprogramming.year2016.day01;

public class Person {

    // Himmelsrichtung
    private CardinalDirection currentlyFacing;
    private Position currentPosition;

    public Person(CardinalDirection currentlyFacing, Position currentPosition) {
        this.currentlyFacing = currentlyFacing;
        this.currentPosition = currentPosition;
    }

    public void move(Command command) {
        // 1. drehen
        // 2. bewegen
    }

    public CardinalDirection getCurrentlyFacing() {
        return currentlyFacing;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

}
