package de.dikodam.advancedprogramming.year2017.day04;

import java.util.*;

public class HighEntropyPassphrases {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        boolean warNochNichtDrin = set.add(1);

    }

    static boolean isPassphraseValid(String passphrase) {
        String[] words = passphrase.split(" ");
        Set<String> buffer = new HashSet<>();

        for (String word : words) {
            boolean wasUnique = buffer.add(word);
            if (!wasUnique) {
                return false;
            }
        }

        return true;
    }
}
