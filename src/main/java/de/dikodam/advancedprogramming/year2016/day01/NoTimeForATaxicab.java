package de.dikodam.advancedprogramming.year2016.day01;

import java.util.ArrayList;
import java.util.List;

public class NoTimeForATaxicab {

    public static void main(String[] args) {
        List<Command> commands = parseInput(Day01Input.getInput());
    }

    private static List<Command> parseInput(String input) {
        List<Command> commands = new ArrayList<>();
        String[] commandStrings = input.split(", ");
        for (String commandString : commandStrings) {
            Command command = Command.from(commandString);
            commands.add(command);
        }
        return commands;
    }


}
