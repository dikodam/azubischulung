package de.dikodam.advancedprogramming.year2016.day01;

public class Command {

    private TurnDirection turnDirection;
    private int steps;

    private Command(TurnDirection turnDirection, int steps) {
        this.turnDirection = turnDirection;
        this.steps = steps;
    }

    public TurnDirection getTurnDirection() {
        return turnDirection;
    }

    public int getSteps() {
        return steps;
    }

    public static Command from(String line) {
        char turnDirectionChar = line.charAt(0);
        TurnDirection turnDirection;
        if (turnDirectionChar == 'L') {
            turnDirection = TurnDirection.LEFT;
        } else {
            turnDirection = TurnDirection.RIGHT;
        }
        int stepCount = Integer.parseInt(line.substring(1));
        return new Command(turnDirection, stepCount);
    }

}
