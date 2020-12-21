package de.dikodam.advancedprogramming.year2016.day01;

public class Command {

    private TurnDirection turnDirection;
    private int steps;

    public Command(TurnDirection turnDirection, int steps) {
        this.turnDirection = turnDirection;
        this.steps = steps;
    }

    public TurnDirection getTurnDirection() {
        return turnDirection;
    }

    public int getSteps() {
        return steps;
    }
}
