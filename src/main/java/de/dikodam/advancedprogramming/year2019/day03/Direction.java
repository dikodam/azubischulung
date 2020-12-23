package de.dikodam.advancedprogramming.year2019.day03;

public enum Direction {
    UP, DOWN, LEFT, RIGHT;

    public static Direction from(char directionChar) {
        if (directionChar == 'L') {
            return LEFT;
        }
        if (directionChar == 'D') {
            return DOWN;
        }
        if (directionChar == 'U') {
            return UP;
        }
        if (directionChar == 'R') {
            return RIGHT;
        }
        return null;
    }
}
