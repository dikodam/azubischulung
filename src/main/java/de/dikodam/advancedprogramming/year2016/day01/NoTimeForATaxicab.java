package de.dikodam.advancedprogramming.year2016.day01;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

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
        String[] commandStrings = input.split(", ");
        // Funktion: eingabe: String ausgabe: Command
        return Arrays
                .stream(commandStrings)
                .map(commandString -> Command.from(commandString))
                .collect(toList());
    }
}
