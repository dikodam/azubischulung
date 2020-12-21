package de.dikodam.advancedprogramming.year2016.day01;

import java.util.ArrayList;
import java.util.List;

public class NoTimeForATaxicab {

    public static void main(String[] args) {
        List<Command> commands = parseInput(Day01Input.getInput());

        Person person = new Person(CardinalDirection.NORTH, new Position(0, 0));

        for (Command command : commands) {
            person.move(command);
        }

        // TODO position von person rausholen
        // euklidische distanz zu (0,0) berechnen

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
