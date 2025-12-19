package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.loop.Counter.sum;

class CounterTest {

    @Test
    void whenStart20ThenFinish30Result275() {
        int start = 20;
        int finish = 30;
        double expected = 275;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void whenStart12ThenFinish4Result0() {
        int start = 12;
        int finish = 4;
        double expected = 0;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToEight() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusEightToFour() {
        int start = -8;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = -14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumberFromMinusFiveHundredToTen() {
        int start = -500;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = -62720;
        assertThat(result).isEqualTo(expected);
    }
}