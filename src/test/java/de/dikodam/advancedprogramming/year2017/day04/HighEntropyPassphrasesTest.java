package de.dikodam.advancedprogramming.year2017.day04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class HighEntropyPassphrasesTest {

    @Test
    void isPassPhraseValid_true() {
        // execute
        boolean actualResult = HighEntropyPassphrases.isPassphraseValid("aa bb cc dd ee");

        // verify
        assertThat(actualResult).isTrue();
    }

    @Test
    void isPassphraseValid_false() {
        boolean actualResult = HighEntropyPassphrases.isPassphraseValid("aa bb cc dd aa");

        assertThat(actualResult).isFalse();
    }

    @Test
    void countValidPassphrases() {
        // setup
        List<String> input = asList("aa bb cc dd ee", "aa bb cc dd aa");

        // execute
        int actualResult = HighEntropyPassphrases.countValidPassphrases(input);

        // verify
        assertThat(actualResult).isEqualTo(1);
    }


}