package de.dikodam.advancedprogramming.year2018.day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {


    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('a', 4);
        map.put('b', 5);
        map.put('c', 11);

        for (Character key : map.keySet()) {
            Integer value = map.get(key);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
        }


//        "hallo"
        // for buchstabe in wort
        // wort in map hochzählen

//        System.out.println(map);
    }


    static Map<Character, Integer> countCharacters(String text) {

        return Collections.emptyMap();
    }

}
