package de.dikodam.advancedprogramming.year2017.day04;

import org.junit.jupiter.api.Test;

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


}