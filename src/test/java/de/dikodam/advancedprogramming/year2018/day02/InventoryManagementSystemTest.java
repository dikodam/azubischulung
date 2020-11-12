package de.dikodam.advancedprogramming.year2018.day02;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementSystemTest {

    @Test
    void countCharacters() {

        Map<Character, Integer> resultMap = InventoryManagementSystem.countCharacters("hallo");

        assertThat(resultMap)
                .containsEntry('h', 1)
                .containsEntry('a', 1)
                .containsEntry('l', 2)
                .containsEntry('o', 1);
    }

}