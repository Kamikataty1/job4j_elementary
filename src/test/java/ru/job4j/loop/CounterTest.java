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
}