package de.dikodam.advancedprogramming.year2016.day01;

import static de.dikodam.advancedprogramming.year2016.day01.CardinalDirection.*;

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
        TurnDirection turnDirection = command.getTurnDirection();
        turn(turnDirection);

        // 2. bewegen
        int stepCount = command.getSteps();
        moveSteps(stepCount);
    }

    private void turn(TurnDirection turnDirection) {
        if (turnDirection == TurnDirection.LEFT) {
            turnLeft();
        } else {
            turnRight();
        }
    }

    private void turnRight() {
        switch (currentlyFacing) {
            case NORTH:
                currentlyFacing = EAST;
                break;
            case SOUTH:
                currentlyFacing = WEST;
                break;
            case EAST:
                currentlyFacing = SOUTH;
                break;
            case WEST:
                currentlyFacing = NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (currentlyFacing) {
            case NORTH:
                currentlyFacing = WEST;
                break;
            case SOUTH:
                currentlyFacing = EAST;
                break;
            case EAST:
                currentlyFacing = NORTH;
                break;
            case WEST:
                currentlyFacing = SOUTH;
                break;
        }
    }

    private void moveSteps(int stepCount) {
        Position movement = null;
        switch (currentlyFacing) {
            case NORTH:
                movement = new Position(0, stepCount);
                break;
            case SOUTH:
                movement = new Position(0, -stepCount);
                break;
            case WEST:
                movement = new Position(-stepCount, 0);
                break;
            case EAST:
                movement = new Position(stepCount, 0);
                break;
        }
        currentPosition = currentPosition.addPosition(movement);
    }

    public CardinalDirection getCurrentlyFacing() {
        return currentlyFacing;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

}
