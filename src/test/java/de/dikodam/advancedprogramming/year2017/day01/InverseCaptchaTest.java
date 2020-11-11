package de.dikodam.advancedprogramming.year2017.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InverseCaptchaTest {

    @Test
    void calculateCaptcha_1() {
        // setup

        // execute
        int result = InverseCaptcha.calculateCaptcha("1122");

        // verify
        assertThat(result).isEqualTo(3);
    }

    @Test
    void calculateCaptcha_2() {
        // setup

        // execute
        int result = InverseCaptcha.calculateCaptcha("1111");

        // verify
        assertThat(result).isEqualTo(4);
    }

    @Test
    void calculateCaptcha_3() {
        // setup

        // execute
        int result = InverseCaptcha.calculateCaptcha("1234");

        // verify
        assertThat(result).isEqualTo(0);
    }

    @Test
    void calculateCaptcha_4() {
        // setup

        // execute
        int result = InverseCaptcha.calculateCaptcha("91212129");

        // verify
        assertThat(result).isEqualTo(9);
    }

    @Test
    void transformInput() {
        // setup
        String input = "1122";

        // execute
        List<Integer> result = InverseCaptcha.transformInput(input);

        // verify
        assertThat(result).containsExactly(1, 1, 2, 2);
    }


}