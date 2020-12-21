package de.dikodam.advancedprogramming.javabasics.streams;

@FunctionalInterface
public interface Condition<T> {

    boolean checkDing(T ding);

}
