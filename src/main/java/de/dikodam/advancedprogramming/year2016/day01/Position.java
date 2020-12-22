package de.dikodam.advancedprogramming.year2016.day01;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position addPosition(Position other) {
        return new Position(this.x + other.x, this.y + other.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
