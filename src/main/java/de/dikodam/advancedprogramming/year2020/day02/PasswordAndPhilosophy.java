package de.dikodam.advancedprogramming.year2020.day02;

import java.util.Objects;

public class PasswordAndPhilosophy {

    private final String password;
    private final Philosophy philosophy; // min, max, char

    public static PasswordAndPhilosophy from(String line) {
        String[] splitLine = line.split(": ");
        String philosophyString = splitLine[0]; // "1-3 a"
        String password = splitLine[1];
        String[] splitPhilosophy = philosophyString.split(" ");
        String character = splitPhilosophy[1];
        String minAndMax = splitPhilosophy[0];
        String[] splitMinAndMax = minAndMax.split("-");
        String min = splitMinAndMax[0];
        String max = splitMinAndMax[1];
        Philosophy philosophy = new Philosophy(Integer.parseInt(min), Integer.parseInt(max), character.charAt(0));
        return new PasswordAndPhilosophy(password, philosophy);
    }


    public PasswordAndPhilosophy(String password, Philosophy philosophy) {
        this.password = password;
        this.philosophy = philosophy;
    }

    public String getPassword() {
        return password;
    }

    public Philosophy getPhilosophy() {
        return philosophy;
    }

    public boolean isValid() {
        return philosophy.validate(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordAndPhilosophy that = (PasswordAndPhilosophy) o;
        return Objects.equals(password, that.password) && Objects.equals(philosophy, that.philosophy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, philosophy);
    }
}
