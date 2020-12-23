package de.dikodam.advancedprogramming.year2019.day03;

public class Command {

    private final Direction direction;
    private final int stepCount;

    public Command(Direction direction, int stepCount) {
        this.direction = direction;
        this.stepCount = stepCount;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getStepCount() {
        return stepCount;
    }
}
