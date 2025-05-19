package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expected = 2.83;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus3Minus5And4And6Then13Dot03() {
        int x1 = -3, y1 = -5, x2 = 4, y2 = 6;
        double expected = 13.03;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}