package de.dikodam.advancedprogramming.year2020.day02;

import java.util.Objects;

public class PasswordAndPhilosophy {

    private final Password password;
    private final Philosophy philosophy;

    public PasswordAndPhilosophy(Password password, Philosophy philosophy) {
        this.password = password;
        this.philosophy = philosophy;
    }

    public Password getPassword() {
        return password;
    }

    public Philosophy getPhilosophy() {
        return philosophy;
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
