package de.dikodam.advancedprogramming.year2019.day03;


import java.util.List;

public class Wire {

    private final List<Point> path;

    public Wire(List<Point> path) {
        this.path = path;
    }

    public List<Point> getPath() {
        return path;
    }
}
